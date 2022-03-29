package lab.lab4.ex1;

public class CoupeCreator extends CarCreator{
    @Override
    public Car factoryMethod() {
        Car car = new Coupe();
        return car;
    }
}
