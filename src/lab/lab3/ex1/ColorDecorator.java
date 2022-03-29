package lab.lab3.ex1;

public class ColorDecorator extends Decorator{

    Car car;

    public ColorDecorator(Car car) {
        this.car = car;
    }

    @Override
    public double getCost() {
        return car.getCost() + 1000;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Color";
    }
}
