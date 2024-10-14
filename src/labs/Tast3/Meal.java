package labs.Tast3;

public class Meal {
    private String mainDish;
    private String side;
    private String drink;
    private String dessert;
    public Meal(String mainDish, String side, String drink, String dessert) {
        this.mainDish = mainDish;
        this.side = side;
        this.drink = drink;
        this.dessert = dessert;
    }
    public Meal(MealBuilder mealBuilder) {
        this.mainDish = mealBuilder.mainDish;
        this.side = mealBuilder.side;
        this.drink = mealBuilder.drink;
        this.dessert = mealBuilder.dessert;
    }
    public String getMainDish() {
        return mainDish;
    }
    public String getSide() {
        return side;
    }
    public String getDrink() {
        return drink;
    }
    public String getDessert() {
        return dessert;
    }
    @Override
    public String toString(){
        return "Meal [mainDish= "+mainDish+", side= "+side+", drink= "+drink+", dessert= "+dessert+"]";
    }
    public static class MealBuilder{
        private String mainDish;
        private String side;
        private String drink;
        private String dessert;
        public MealBuilder(String mainDish){
            this.mainDish = mainDish;
        }
        public MealBuilder side(String side){
            this.side = side;
            return this;
        }
        public MealBuilder drink(String drink){
            this.drink = drink;
            return this;
        }
        public MealBuilder dessert(String dessert){
            this.dessert = dessert;
            return this;
        }
        public Meal build(){
            return new Meal(this);
        }

    }
}
