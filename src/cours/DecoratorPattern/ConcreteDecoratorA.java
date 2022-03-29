package cours.DecoratorPattern;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        System.out.println("I'm adding new responsibility A at runtime.");
        super.operation();
    }
}
