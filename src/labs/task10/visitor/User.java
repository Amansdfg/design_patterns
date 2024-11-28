package labs.task10.visitor;

public class User implements Visitable {
    private String name;
    private int loyaltyPoints;

    public User(String name, int loyaltyPoints) {
        this.name = name;
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getName() {
        return name;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
