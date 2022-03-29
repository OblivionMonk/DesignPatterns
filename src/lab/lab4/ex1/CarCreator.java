package lab.lab4.ex1;

public abstract class CarCreator {

    abstract public Car factoryMethod();

    public Car orderCar(String color){
        Car car = factoryMethod();
        car.setColor(color);
        return car;
    }
}
