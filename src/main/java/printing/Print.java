package printing;

import gameobjects.Stand;

public class Print {

    public void printMessage(int messageNumber){
        switch (messageNumber){
            case 1:
                System.out.println("Stand 1 has all disc at the beginning");
                break;

            case 2:
                System.out.println("Enter stand number (1, 2, 3) to take disc from:");
                break;

            case 3:
                System.out.println("Enter stand number (1, 2, 3) to put disc on:");
                break;
        }
    }

    public void printStands(Stand stand1, Stand stand2, Stand stand3){
        System.out.println("Stand 1");
        stand1.printStand();

        System.out.println("Stand 2");
        stand2.printStand();

        System.out.println("Stand 3");
        stand3.printStand();
    }
}
