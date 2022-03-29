package lab.lab3.ex1;

public class EngineDecorator extends Car{

    Car car;

    public EngineDecorator(Car car) {
        this.car = car;
    }

    @Override
    public double getCost() {
        return car.getCost() + 2000;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 5;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Engine";
    }
}
