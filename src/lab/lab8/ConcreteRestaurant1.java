package lab.lab8;

public class ConcreteRestaurant1 extends AbstractRestaurant{
    @Override
    void prepareVegetables() {
        System.out.println("Preparing tomatoes");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Preparing steaks");
    }

    @Override
    void prepareCheese() {
        System.out.println("Preparing Gruyère");
    }

    @Override
    void prepareDessert() {
        System.out.println("Preparing crème brûlée");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Preparing espresso");
    }
}
