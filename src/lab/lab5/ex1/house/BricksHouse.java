package lab.lab5.ex1.house;

import lab.lab5.ex1.wall.*;

/**
 * Lab 4
 * @author scz
 */
public class BricksHouse extends House {
    
    public BricksHouse() {
        this.name = "Typical dutch house";
    }

    @Override
    protected Wall createWall() {
        return new BricksWall();
    }

}
