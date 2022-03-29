package cours.DecoratorPattern;

public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        addedBehavior();
        super.operation();
    }

    public void addedBehavior(){
        System.out.println("I'm adding new responsibility B at runtime.");
    }
}
