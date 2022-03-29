package cours.StrategyPattern;

public class ConcreteStrategyB implements Strategy{

    @Override
    public void algorithm() {
        System.out.println("Nice concrete strategy B");
    }
}
