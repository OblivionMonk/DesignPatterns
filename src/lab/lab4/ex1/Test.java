package lab.lab4.ex1;

public class Test {
    public static void main(String[] args) {
        CarCreator coupeCreator = new CoupeCreator();
        CarCreator minivanCreator = new MinivanCreator();
        CarCreator pickupCreator = new PickupCreator();
        Car c1 = coupeCreator.orderCar("red");
        System.out.println("Car "
                + c1.getName()
                + " " + c1.getColor()
                + " has been ordered.");
        Car c2 = minivanCreator.orderCar("red");
        System.out.println("Car "
                + c2.getName()
                + " "
                + c2.getColor()
                + " has been ordered.");
        Car c3 = pickupCreator.orderCar("red");
        System.out.println("Car "
                + c3.getName()
                + " "
                + c3.getColor()
                + " has been ordered.");
    }
}
