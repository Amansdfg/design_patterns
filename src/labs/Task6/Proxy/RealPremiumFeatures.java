package labs.Task6.Proxy;


public class RealPremiumFeatures implements PremiumFeatures {
    @Override
    public void viewSeasonalMenu() {
        System.out.println("Displaying seasonal menu items...");
    }

    @Override
    public void viewExclusivePromotions() {

        System.out.println("Displaying exclusive promotions for members...");
    }
}
