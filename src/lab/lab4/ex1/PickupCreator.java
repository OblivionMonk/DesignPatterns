package lab.lab4.ex1;

public class PickupCreator extends CarCreator{
    @Override
    public Car factoryMethod() {
        Car car = new Pickup();
        return car;
    }
}
