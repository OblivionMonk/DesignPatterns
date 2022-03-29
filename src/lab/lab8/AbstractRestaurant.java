package lab.lab8;

public abstract class AbstractRestaurant {
    final void prepareDinner(){
        serveWater();
        prepareVegetables();
        prepareMainMenu();
        prepareCheese();
        prepareDessert();
        prepareCoffee();
        cleanTable();
    }

    public void serveWater(){
        System.out.println("Pouring water in glass");
    }

    public void cleanTable(){
        System.out.println("Cleaning the table");
    };

    abstract void prepareVegetables();
    abstract void prepareMainMenu();
    abstract void prepareCheese();
    abstract void prepareDessert();
    abstract void prepareCoffee();
}
