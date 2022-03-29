package lab.lab1.ex1;

public abstract class Character {
    public WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }
}
