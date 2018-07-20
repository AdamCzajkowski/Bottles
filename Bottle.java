package bottles;

import java.util.Random;

public class Bottle {
    public double capacityOfBottle = 10.0;
    public double quantityInBottle;

    Bottle(double quantityInBottle) {

        this.quantityInBottle = quantityInBottle;
    }

    double getQuantityInBottle() {
        return quantityInBottle;
    }



    // starting quantity of bottle, every next bottle has liter more
    static void startQuantityOfBottles(int howManyBottles) {
        Bottle[] bottle = new Bottle[howManyBottles];
        Random random = new Random();

        for (int i = 1; i < howManyBottles; i++) {
            bottle[i] = new Bottle(i);
            bottle[i].getQuantityInBottle();
            System.out.println(bottle[i].getQuantityInBottle());
        }
    }

    static void capacityOfBottles(int howManyBottles) {

    }

    public boolean pourOut(double quantity) {
        if (this.quantityInBottle >= quantity) {
            this.quantityInBottle -= quantity;
        } else {
            System.out.println("\nYou're wanting pour out more water than was there before");
            this.quantityInBottle = 0;
        }
        return true;
    }

    public boolean pour(double quantity) {
        this.quantityInBottle += quantity;
        return true;
    }

}
