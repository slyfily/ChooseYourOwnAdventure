
import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void main(String[] args) {

        //Variables
        int secOnePower = 10;

        int choice;
        int choice2 = 0;
        int energy = 0;

        Scanner choiceScan = new Scanner(System.in);

        // Intro
        System.out.println("--Prologue--\n"
                + "Welcome to the city... \n"
                + "it sucks here,\n"
                + "but luckily you will be living in the safety of a wing!\n"
                + "You will be temporarily taking over as manager as we sort out an internal issue\n"
                + "As manager you are tasked with making vital choices and making sure enough power is produced each day-\n\n"
                + "Face the fear, build the future");

        System.out.println("--Day (Preamble)--\n"
                + "Section One Employee Power: " + secOnePower + "\n"
                + "Abnormalities: Opened Can of WellCheers, Child of the Galaxy, Nothing There \n");

        System.out.println("The Abnormality Opened Can of WellCheers requires work, \n"
                + "Would You like to send an employee to do, Instinct(1), Insight(2), Attatchment(3), Repression(4), or nothing(5)?");

        choice = Integer.parseInt(choiceScan.nextLine());

        if (choice == 1 || choice == 2) {
            System.out.println("It seemed to like that. 10 PE-Boxes produced and section power has raised by 5.");
            secOnePower += 5;
            energy += 10;
        } else if (choice == 3 || choice == 4) {
            System.out.println("It seemed to be indifferent to that. 7 PE-Boxes produced.");
            energy += 7;
        } else {
            System.out.println("It seems to be displeased. 0 PE-Boxes produced.");
        }
        System.out.println("The Abnormality Child of the Galaxy requires work, \n"
                + "Would You like to send an employee to do, Instinct(1), Insight(2), Attatchment(3), Repression(4), or nothing(5)?");

        choice = Integer.parseInt(choiceScan.nextLine());

        if (choice != 5) {
            System.out.println("It seemed to like that. 16 PE-Boxes produced and section power has raised by 2.");
            energy += 16;
            secOnePower += 2;

        } else {
            System.out.println("The Abnormality's face seems to sadden as it enters a state of dispair. \n It breaches the facility");
            System.out.println("How much of staff would you like to send to suppress it?\n"
                    + "100% (1, 90% success rate), 75% (2, 75% success rate), 50% (3, 50% success rate), 0% (4, 0% success rate)");
            choice2 = Integer.parseInt(choiceScan.nextLine());
        }

        if (choice2 == 1) {
            if (((int) (Math.random() * 100) + 1) + secOnePower / 2 > 10) {
                System.out.println("Suppression successful. 16 PE-Boxes produced");
                energy += 16;
            } else {
                secOnePower /= 10;
            }
        } else if (choice2 == 2) {
            if (((int) (Math.random() * 100) + 1) + secOnePower / 2 > 25) {
                System.out.println("Suppression successful. 16 PE-Boxes produced");
                energy += 16;
            } else {
                System.out.println("Suppression unsuccessful. 0 PE-Boxes produced");
                secOnePower /= 4;
            }
        } else if (choice2 == 3) {
            if (((int) (Math.random() * 100) + 1) + secOnePower / 2 > 50) {
                System.out.println("Suppression successful. 16 PE-Boxes produced");
                energy += 16;
            } else {
                System.out.println("Suppression unsuccessful. 0 PE-Boxes produced");
                secOnePower /= 2;
            }
        } else if (choice2 == 4) {
            System.out.println("Suppression unsuccessful. 0 PE-Boxes produced");
        }

        System.out.println("The Abnormality Mountain of Smiling Bodies requires work, \n"
                + "Would You like to send an employee to do, Instinct(1), Insight(2), Attatchment(3), Repression(4), or nothing(5)?");

        choice = Integer.parseInt(choiceScan.nextLine());

        if (choice == 1 || choice == 4) {
            System.out.println("It seemed to like that. 30 PE-Boxes produced.");
            energy += 30;

        } else {
            System.out.println("The Abnormality's seems very uneasy. \n It breaches the facility");
            System.out.println("How much of staff would you like to send to suppress it?\n"
                    + "100% (1, 70% success rate), 50% (2, 75% success rate), 30% (3, 50% success rate), 0% (4, 0% success rate)");
            choice2 = Integer.parseInt(choiceScan.nextLine());
        }

        if (choice2 == 1) {
            if (((int) (Math.random() * 100) + 1) + secOnePower / 2 > 30) {
                System.out.println("Suppression successful. 30 PE-Boxes produced");
                energy += 30;
            } else {
                secOnePower /= 10;
            }
        } else if (choice2 == 2) {
            if (((int) (Math.random() * 100) + 1) + secOnePower / 2 > 50) {
                System.out.println("Suppression successful. 30 PE-Boxes produced");
                energy += 30;
            } else {
                System.out.println("Suppression unsuccessful. 0 PE-Boxes produced");
                secOnePower /= 4;
            }
        } else if (choice2 == 3) {
            if (((int) (Math.random() * 100) + 1) + secOnePower / 2 > 70) {
                System.out.println("Suppression successful. 30 PE-Boxes produced");
                energy += 30;
            } else {
                System.out.println("Suppression unsuccessful. 0 PE-Boxes produced");
                secOnePower /= 2;
            }
        } else if (choice2 == 4) {
            System.out.println("Suppression unsuccessful. 0 PE-Boxes produced");
        }

        System.out.println("--Day End--\n");
        if (energy == 56) {
            System.out.println("Great job, you passed were able to make it through the day\n"
                    + "You were able to produce " + energy + " PE-Boxes...");
            System.out.println("\nWait... this isn't right you are risking the lives of others just for your own benefit,"
                    + "\nbut before you could protest and try to reform this place, you are killed."
                    + "\nThe script must continue");
        } else if (energy < 56 && energy > 26) {
            System.out.println("Great job, you passed were able to make it through the day.\n"
                    + "You were able to produce " + energy + " PE-Boxes.");
            System.out.println("\nWhile there were some work problems generally all went well."
                    + "You hope that when the manager returns all continues to go well.");
        } else {
            System.out.println("Before you could know, time rewinded\n");
            System.out.println("--Prologue--\n"
                    + "Welcome to the city... \n"
                    + "it sucks here,\n"
                    + "but luckily you will be living in the safety of a wing!\n"
                    + "You will be temporarily taking over as manager as we sort out an internal issue\n"
                    + "As manager you are tasked with making vital choices and making sure enough power is produced each day-\n\n"
                    + "Face the fear, build the future");
        }
    }
}
