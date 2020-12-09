import gameobject.Disc;
import gameobject.Stand;

import java.util.Scanner;

public class App {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Disc disc = new Disc();

        Stand stand1 = new Stand(1);
        Stand stand2 = new Stand(2);
        Stand stand3 = new Stand(3);

        stand1.setDiscValues();

        int standNumberForDisc = 0;
        int standNumberToTakeDisc = 0;

        System.out.println("Stand 1 has all disc at the beginning");

        while (true){

            System.out.println("Enter stand number to take disc from:");
            standNumberToTakeDisc = scanner.nextInt();

            switch (standNumberToTakeDisc){
                case 1:
                    printStands(stand1, stand2, stand3);
                    disc.setValue(stand1.takeDiscFromStand());
                    break;

                case 2:
                    printStands(stand1, stand2, stand3);
                    disc.setValue(stand2.takeDiscFromStand());
                    break;

                case 3:
                    printStands(stand1, stand2, stand3);
                    disc.setValue(stand3.takeDiscFromStand());
                    break;
            }

            System.out.println("Enter stand number to put disc on:");
            standNumberForDisc = scanner.nextInt();

            switch (standNumberForDisc){
                case 1:
                    printStands(stand1, stand2, stand3);
                    stand1.putDiscOnStand(disc.getValue());
                    stand1.checkIfDiscsAreSequential();
                    disc.setValue(0);
                    break;

                case 2:
                    printStands(stand1, stand2, stand3);
                    stand2.putDiscOnStand(disc.getValue());
                    stand2.checkIfDiscsAreSequential();
                    disc.setValue(0);
                    break;

                case 3:
                    printStands(stand1, stand2, stand3);
                    stand3.putDiscOnStand(disc.getValue());
                    stand3.checkIfDiscsAreSequential();
                    disc.setValue(0);
                    break;
            }


        }


    }

    private static void printStands(Stand stand1, Stand stand2, Stand stand3) {
        stand1.printStand();
        stand2.printStand();
        stand3.printStand();
    }
}
