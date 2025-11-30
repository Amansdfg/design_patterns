package BehavioralDesignPatterns.Visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

