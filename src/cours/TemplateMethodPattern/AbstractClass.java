package cours.TemplateMethodPattern;

public abstract class AbstractClass {
    final void templateMethod() {
        primitiveOperation1();
        notPrimitiveOperation();
        primitiveOperation2();
    }

    protected abstract void notPrimitiveOperation();

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();
}
