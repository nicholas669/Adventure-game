import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Adventure Game");
            System.out.println("Choose your path");
            System.out.println("1. Forest");
            System.out.println("2. Shore");

            System.out.print("Enter your choice: ");
            int choice1 = scan.nextInt();
            if (choice1 == 1) {
                System.out.println("\nYou venture into the dense forest. The trees are tall, and the air is thick with the scent of pine.");
                System.out.println("You hear a rustling sound. What do you do?");
                System.out.println("1. Investigate the sound");
                System.out.println("2. Keep walking");
                System.out.print("Enter your choice: ");
                int forestChoice = scan.nextInt();
                if (forestChoice == 1) {
                    System.out.println("\nYou approach the sound cautiously. Suddenly, a wild wolf appears!");
                    System.out.println("What do you do?");
                    System.out.println("1. Fight the wolf");
                    System.out.println("2. Run away");
                    System.out.print("Enter your choice: ");
                    int Wolfchoice = scan.nextInt();
                    if (Wolfchoice == 1) {
                        System.out.println("\nYou grab a stick and fight bravely. After a fierce battle, the wolf retreats!");
                    } else {
                        System.out.println("\nYou run as fast as you can, barely escaping the wolf. You feel lucky to be alive.");
                    }

                } else {
                    System.out.println("You decide to rest and enjoy the peaceful surroundings.");
                }

            } else if (choice1 == 2) {
                System.out.println("\nYou walk towards the shore. The sound of waves crashing fills your ears.");
                System.out.println("You see an old boat tied to a post.");
                System.out.println("1. Take the boat and explore the sea");
                System.out.println("2. Stay on the shore");
                System.out.print("Enter your choice: ");
                int Shorechoice = scan.nextInt();
                if (Shorechoice == 1) {
                    System.out.println("\nYou set sail and head out to sea. Suddenly, a storm begins to brew.");
                    System.out.println("What do you do?");
                    System.out.println("1. Try to navigate through the storm");
                    System.out.println("2. Turn back to shore");
                    System.out.print("Enter your choice: ");
                    int Seachoice = scan.nextInt();
                    if (Seachoice == 1) {
                        System.out.println("\nYou bravely face the storm and manage to find a mysterious island.");
                        System.out.println("On the island, you discover hidden treasure!");
                    } else {
                        System.out.println("\nYou turn back just in time and safely reach the shore.");
                        System.out.println("Sometimes, being cautious is better.");
                    }
                } else {
                    System.out.println("\nYou stay on the shore and build a small shelter while waiting for a chance to go out of the island");
                }

            } else {
                System.out.println("\nInvalid choice. Please restart the game and choose either 1 or 2.");
            }
            System.out.print("\nDo you want play again (yes/no)?: ");
            scan.nextLine();
            String resp = scan.nextLine();

            if (Objects.equals(resp, "no")){
                break;
            }

        }
        System.out.println("Thanks for playing!");

    }
    }

//pastikan sudah buat repo onlinenya
//git init .
//git branch -M main
//git add .
//git commit -m "nama terserah"
//git remote add origin namalink
//git push -u origin main