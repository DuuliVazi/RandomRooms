import java.util.Random;
import java.util.Scanner;

public class mars {

    // Function for intro that explains personalized tour.
    public void Intro(String intro) {
        System.out.println(
                "Welcome to your personalized Mars experience tour. You will see all of the crew members you guys have on board.\nThis tour will start off at the Mars base and you can choose to assign each member to a room. --HAVE FUN--\n ");

    }

    public static void main(String[] args) {

        // Object that calls the Intro(String intro) function.
        mars m1 = new mars();
        m1.Intro("");

        // Simple String array created to hold 10 crew member names.
        String[] crewm = new String[10];
        // 10 hardcoded crew members.
        crewm[0] = "Josh";
        crewm[1] = "Alexa";
        crewm[2] = "Tom";
        crewm[3] = "Chrissy";
        crewm[4] = "Mike";
        crewm[5] = "Ariel";
        crewm[6] = "Fernando";
        crewm[7] = "Tim";
        crewm[8] = "Jade";
        crewm[9] = "Mary";

        // Displays all crew members
        System.out.println("CREW MEMBERS:");
        for (String s : crewm) {
            System.out.println(s + '\n');
        }

        // Simple int array to hold 10 room #'s.
        int[] roomno = new int[10];
        // 10 hardcoded room #'s.
        roomno[0] = 1;
        roomno[1] = 15;
        roomno[2] = 37;
        roomno[3] = 48;
        roomno[4] = 11;
        roomno[5] = 29;
        roomno[6] = 6;
        roomno[7] = 31;
        roomno[8] = 18;
        roomno[9] = 44;

        // Displays all room #'s.
        System.out.println("AVAILABLE ROOMS:");
        for (int i : roomno) {
            System.out.println(i);
        }

        // While loop at true runs until user breaks program.
        while (true) {
            /*
             * Random object created to replace 10 hardcoded room #'s with 10 random room
             * #'s on line 83.
             */
            Random r = new Random();
            // Choice variable made to let program know user input will be a string.
            String choice;
            // Scanner object made to let program read user input.
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "You can assign each member to a random room as many times as you would like. To assign each crew member to a room, click Y or y. If not, you press any other key:");
            // Sets choice string equal to scanner object to read user input as string.
            choice = sc.nextLine();
            System.out.println('\n');
            /*
             * If user input is Y or y, then replaces 10 hardcoded room #'s with 10 random
             * #'s up to 50. Then assigns each crew member their own random room # on line
             * 85.
             */
            if (choice.equals("Y") || choice.equals("y")) {
                for (int i = 0; i < roomno.length; i++) {
                    roomno[i] = r.nextInt(50);
                    System.out.println("--" + crewm[i] + " is assigned to room " + roomno[i] + "--" + '\n');
                }
                // If user chooses anything other than Y or y, then while loop breaks.
            } else {
                System.out.println("Have a great day!");
                System.exit(0);
            }
        }

    }
}
