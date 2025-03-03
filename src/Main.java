import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1: Count up to 30
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line for better output formatting

        // Task 2: Count down from 30
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line for better output formatting

        // Task 3: Count up by 3 from 0 to 18
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line for better output formatting

        // Task 4: Count down by 2 from 10 to 0
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line for better output formatting

        // Task 5: Nested loop to create the star pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 6: Nested loop to create the inverted star pattern
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 7: Nested loop to create the square figure
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 8: DieRollar program
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String choice;

        do {
            System.out.printf("%-5s %-5s %-5s %-5s %-5s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 1;

            while (true) {
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-5d %-5d %-5d %-5d %-5d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }

                rollCount++;
            }

            System.out.println("Do you want to continue? (yes to continue, no to quit): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
