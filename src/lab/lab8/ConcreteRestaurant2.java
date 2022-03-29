package lab.lab8;

public class ConcreteRestaurant2 extends AbstractRestaurant{
    void prepareVegetables() {
        System.out.println("Preparing brocolis");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Preparing salmon");
    }

    @Override
    void prepareCheese() {
        System.out.println("Preparing mozzarella");
    }

    @Override
    void prepareDessert() {
        System.out.println("Preparing tiramisu");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Preparing macchiato");
    }
}
