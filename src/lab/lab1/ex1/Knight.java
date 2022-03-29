package lab.lab1.ex1;

public class Knight extends Character{

    public Knight(WeaponBehavior weapon){
        this.weapon = weapon;
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}