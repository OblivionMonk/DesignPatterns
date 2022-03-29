package lab.lab3.ex1;

public class AirbagDecorator extends Decorator{
    Car car;

    public AirbagDecorator(Car car) {
        this.car = car;
    }

    @Override
    public double getCost() {
        return car.getCost() + 200;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 2;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Airbag";
    }
}
