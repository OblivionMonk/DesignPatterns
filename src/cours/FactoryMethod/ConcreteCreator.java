package cours.FactoryMethod;

public class ConcreteCreator extends Creator{


    @Override
    public Product factoryMethod() {
        return new ConcreteProduct("Helicopter");
    }
}
