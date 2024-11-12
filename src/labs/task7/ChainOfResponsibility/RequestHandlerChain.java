package labs.task7.ChainOfResponsibility;


public class RequestHandlerChain {
    public static RequestHandler createChain() {
        RequestHandler dietaryHandler = new DietaryRequirementHandler();
        RequestHandler ingredientHandler = new IngredientAdditionHandler();
        RequestHandler preparationHandler = new PreparationRequestHandler();

        dietaryHandler.setNextHandler(ingredientHandler);
        ingredientHandler.setNextHandler(preparationHandler);
        return dietaryHandler;
    }
}
