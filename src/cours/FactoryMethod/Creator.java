package cours.FactoryMethod;

public abstract class Creator {

    abstract public Product factoryMethod();

    public void anOperation(){
        Product product = factoryMethod();
        System.out.println("I am doing some job with product " + product.toString());
    }
}
