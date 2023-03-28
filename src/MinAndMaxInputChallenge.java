/*Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
        -Before the user enters the number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        number.
        Hint:
        -Use an endless while loop.
        -Create a class with the name MinAndMaxInputChallenge.*/

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Enter number : ");
            // condition
            boolean validateNumber = scanner.hasNextInt();
            if (validateNumber) {
                number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid number");
                break;
            }
            // Always return new userInput
            scanner.nextLine();
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        // closing scanner object
        scanner.close();
    }
}

