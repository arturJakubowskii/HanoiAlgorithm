import gameobject.Stand;

import java.util.Scanner;

public class App {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stand stand1 = new Stand(1);
        Stand stand2 = new Stand(2);
        Stand stand3 = new Stand(3);

        stand1.setDiscs();

        int disc = 0;
        int standNumber = 0;
        int standNumberForDisc = 0;
        int standNumberToTakeDisc = 0;

        System.out.println("Stand 1 has all disc at the beginning");

        while (true){

            System.out.println("Enter stand number to take disc from:");
            standNumberToTakeDisc = scanner.nextInt();

            switch (standNumberToTakeDisc){
                case 1:
                    aaaaa(stand1, stand2, stand3);
                    disc = stand1.takeDiscFromStand();
                    break;

                case 2:
                    aaaaa(stand1, stand2, stand3);
                    disc = stand2.takeDiscFromStand();
                    break;

                case 3:
                    aaaaa(stand1, stand2, stand3);
                    disc = stand3.takeDiscFromStand();
                    break;
            }

            System.out.println("Enter stand number to put disc on:");
            standNumberForDisc = scanner.nextInt();

            switch (standNumberForDisc){
                case 1:
                    stand1.printStand();
                    stand1.putDiscOnStand(disc);
                    stand1.checkIfDiscsAreSequential();
                    disc = 0;
                    break;

                case 2:
                    stand2.printStand();
                    stand2.putDiscOnStand(disc);
                    stand2.checkIfDiscsAreSequential();
                    disc = 0;
                    break;

                case 3:
                    stand3.printStand();
                    stand3.putDiscOnStand(disc);
                    stand3.checkIfDiscsAreSequential();
                    disc = 0;
                    break;
            }


        }


    }

    private static void aaaaa(Stand stand1, Stand stand2, Stand stand3) {
        stand1.printStand();
        stand2.printStand();
        stand3.printStand();
    }
}
