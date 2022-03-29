package cours.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new ConcreteStrategyB());

        context.doSomeJob();

        context.setCurrentStrategy(new ConcreteStrategyA());

        context.doSomeJob();
    }
}
