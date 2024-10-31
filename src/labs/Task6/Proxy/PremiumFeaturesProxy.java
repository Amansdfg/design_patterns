package labs.Task6.Proxy;

// Proxy for premium features, controlling access and logging
public class PremiumFeaturesProxy implements PremiumFeatures {
    private RealPremiumFeatures realPremiumFeatures;
    private boolean isMember; // Check if the user is a member

    public PremiumFeaturesProxy(boolean isMember) {
        this.isMember = isMember;
        this.realPremiumFeatures = new RealPremiumFeatures(); // Lazy initialization if needed
    }

    @Override
    public void viewSeasonalMenu() {
        if (isMember) {
            System.out.println("Access granted: Viewing seasonal menu.");
            realPremiumFeatures.viewSeasonalMenu();
            logAccess("Seasonal menu");
        } else {
            System.out.println("Access denied: Membership required to view seasonal menu.");
            logAccess("Attempted access to seasonal menu");
        }
    }

    @Override
    public void viewExclusivePromotions() {
        if (isMember) {
            System.out.println("Access granted: Viewing exclusive promotions.");
            realPremiumFeatures.viewExclusivePromotions();
            logAccess("Exclusive promotions");
        } else {
            System.out.println("Access denied: Membership required to view exclusive promotions.");
            logAccess("Attempted access to exclusive promotions");
        }
    }

    // Log access attempts for monitoring
    private void logAccess(String feature) {
        System.out.println("Logging access attempt for feature: " + feature);
    }
}
