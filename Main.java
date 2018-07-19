package bottles;


public class Main {
    void startCapacityOfBottles(int howManyBottles) {
        Bottle[] bottle = new Bottle[howManyBottles];
        for (int i = 0; i < howManyBottles; i++) {
            bottle[i] = new Bottle(0.5 * howManyBottles);
        }
    }

    public static void main(String[] args) {
        
    }
}
