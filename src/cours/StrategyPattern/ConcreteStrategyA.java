package cours.StrategyPattern;

public class ConcreteStrategyA implements Strategy{

    @Override
    public void algorithm() {
        System.out.println("Nice concrete strategy");
    }
}
