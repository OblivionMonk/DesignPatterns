package cours.FactoryMethod;

public class Test {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.anOperation();
    }
}
