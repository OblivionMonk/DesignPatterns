package lab.lab1.ex1;

public class Troll extends Character{

    public Troll (){
        this.weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}