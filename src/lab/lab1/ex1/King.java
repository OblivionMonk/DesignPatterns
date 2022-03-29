package lab.lab1.ex1;

public class King extends Character {

    public King(){
        this.weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
