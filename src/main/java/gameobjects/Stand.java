package gameobjects;

import java.util.ArrayList;
import java.util.List;

public class Stand {

    private final int standNumber;

    public Stand(int standNumber) {
        this.standNumber = standNumber;
    }

    private final List<Integer> standAsArray = new ArrayList<>();


    public void setDiscValues(){
        standAsArray.add(1);
        standAsArray.add(2);
        standAsArray.add(3);
    }

    public void putDiscOnStand(int discValue){
        standAsArray.add(discValue);
    }

    public void printStand(){
        for (int disc : standAsArray){
            System.out.println(disc);
        }
        System.out.println("\n");
    }

    public int takeDiscFromStand(){
        try {
            int disc = standAsArray.get(standAsArray.size() -1);
            standAsArray.remove(standAsArray.size() -1);
            return disc;
        }
        catch (Exception e){
            System.out.println("You can't take disc from empty stand!");
            return 0;
        }

    }

    public void checkIfDiscsAreSequential(){
        int firstDiscValue = standAsArray.get(0);
        int lastDiscValue = standAsArray.get(standAsArray.size() -1);

        if (firstDiscValue == 3
                && lastDiscValue == 1 && standAsArray.size() == 3){
            System.out.println("YOU WON!!!");
            System.exit(0);
        }
    }

}
