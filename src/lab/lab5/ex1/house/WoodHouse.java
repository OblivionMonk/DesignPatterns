package lab.lab5.ex1.house;


import lab.lab5.ex1.wall.*;

/**
 * Lab 4
 * @author scz
 */
public class WoodHouse extends House {
    
    public WoodHouse() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected Wall createWall() {
        return new WoodWall();
    }
    
}
