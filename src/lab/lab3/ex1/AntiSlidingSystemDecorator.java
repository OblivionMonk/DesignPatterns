package lab.lab3.ex1;

public class AntiSlidingSystemDecorator extends Car{

    Car car;

    public AntiSlidingSystemDecorator(Car car) {
        this.car = car;
    }

    @Override
    public double getCost() {
        return car.getCost() + 6000;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 4;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Anti-Sliding System";
    }
}
