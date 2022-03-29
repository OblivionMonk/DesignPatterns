package cours.DecoratorPattern;

public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("This is a concrete component");
    }
}
