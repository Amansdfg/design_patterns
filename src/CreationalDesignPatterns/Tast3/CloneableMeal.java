package CreationalDesignPatterns.Tast3;

class CloneableMeal extends Meal implements Cloneable {
    public CloneableMeal(String mainDish, String side, String drink, String dessert) {
        super(mainDish, side, drink, dessert);
    }

    @Override
    protected CloneableMeal clone() {
        try {
            return (CloneableMeal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
