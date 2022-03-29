package lab.lab1.ex1;

public class Ex1 {
    public static void main(String[] args) {
        King king = new King();
        Queen queen = new Queen();

        king.fight();
        queen.fight();

        queen.setWeapon(new KnifeBehavior());

        queen.fight();

    }
}
