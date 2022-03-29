package lab.lab1.ex1;

public class Queen extends Character{

    public Queen(){
        this.weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
