package cours.TemplateMethodPattern;

public class Test {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }
}
