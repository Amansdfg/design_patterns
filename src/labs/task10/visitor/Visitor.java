package labs.task10.visitor;

public interface Visitor {
    void visit(MenuItem menuItem);
    void visit(Order order);
    void visit(User user);
}
