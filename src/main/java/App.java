import gameobjects.Disc;
import gameobjects.Stand;
import printing.Print;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Print print = new Print();

        Disc disc = new Disc();

        Stand stand1 = new Stand(1);
        Stand stand2 = new Stand(2);
        Stand stand3 = new Stand(3);

        stand1.setDiscValues();

        int standNumberForDisc = 0;
        int standNumberToTakeDisc = 0;

        print.printMessage(1);

        while (true){

            print.printMessage(2);

            standNumberToTakeDisc = scanner.nextInt();

            switch (standNumberToTakeDisc){
                case 1:
                    print.printStands(stand1, stand2, stand3);
                    disc.setValue(stand1.takeDiscFromStand());

                    break;

                case 2:
                    print.printStands(stand1, stand2, stand3);
                    disc.setValue(stand2.takeDiscFromStand());

                    break;

                case 3:
                    print.printStands(stand1, stand2, stand3);
                    disc.setValue(stand3.takeDiscFromStand());

                    break;
            }


            if (checkIfDiscValueIsZero(disc)) continue;

            print.printMessage(3);
            standNumberForDisc = scanner.nextInt();

            switch (standNumberForDisc){
                case 1:
                    stand1.putDiscOnStand(disc.getValue());
                    stand1.checkIfDiscsAreSequential();
                    disc.setValue(0);
                    break;

                case 2:
                    stand2.putDiscOnStand(disc.getValue());
                    stand2.checkIfDiscsAreSequential();
                    disc.setValue(0);
                    break;

                case 3:
                    stand3.putDiscOnStand(disc.getValue());
                    stand3.checkIfDiscsAreSequential();
                    disc.setValue(0);
                    break;
            }

        }

    }

    private static boolean checkIfDiscValueIsZero(Disc disc) {
        if (disc.getValue() == 0){
            return true;
        }
        return false;
    }

}
