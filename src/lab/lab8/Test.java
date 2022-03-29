package lab.lab8;

public class Test {
    public static void main(String[] args) {
        AbstractRestaurant resto1 = new ConcreteRestaurant1();
        AbstractRestaurant resto2 = new ConcreteRestaurant2();

        resto1.prepareDinner();
        System.out.println();
        resto2.prepareDinner();
    }
}
