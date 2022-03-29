package lab.lab4.ex1;

public class MinivanCreator extends CarCreator{
    @Override
    public Car factoryMethod() {
        Car car = new Minivan();
        return car;
    }
}
