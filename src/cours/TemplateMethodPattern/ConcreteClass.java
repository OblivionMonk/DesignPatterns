package cours.TemplateMethodPattern;

public class ConcreteClass extends AbstractClass{


    @Override
    protected void notPrimitiveOperation() {
        System.out.println("Not Primitive Concrete Operation");
    }

    @Override
    protected void primitiveOperation1() {
        System.out.println("Concrete Operation 1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Concrete Operation 2");
    }
}
