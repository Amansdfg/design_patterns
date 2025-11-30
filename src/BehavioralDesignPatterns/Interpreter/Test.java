package BehavioralDesignPatterns.Interpreter;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        String expression1 = "5 3 +";
        Expression expr1 = context.evaluate(expression1);
        System.out.println(expression1 + " = " + expr1.interpret());

        String expression2 = "10 2 -";
        Expression expr2 = context.evaluate(expression2);
        System.out.println(expression2 + " = " + expr2.interpret());

        String expression3 = "4 3 *";
        Expression expr3 = context.evaluate(expression3);
        System.out.println(expression3 + " = " + expr3.interpret());

        String expression4 = "10 2 + 3 *";
        Expression expr4 = context.evaluate(expression4);
        System.out.println(expression4 + " = " + expr4.interpret());
    }
}

