package labs.Task6.Proxy;

public class MealOrderSystem {
    public static void main(String[] args) {
        // Non-member trying to access premium features
        PremiumFeatures nonMemberProxy = new PremiumFeaturesProxy(false);
        nonMemberProxy.viewSeasonalMenu();            // Should be denied
        nonMemberProxy.viewExclusivePromotions();     // Should be denied

        System.out.println();

        // Member accessing premium features
        PremiumFeatures memberProxy = new PremiumFeaturesProxy(true);
        memberProxy.viewSeasonalMenu();               // Should be granted
        memberProxy.viewExclusivePromotions();        // Should be granted
    }
}
