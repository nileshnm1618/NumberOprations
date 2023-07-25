import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // Calculate the sum of the largest number
        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        double sumOfLargest = max;

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3;

        // Display the results
        System.out.println("Sum of the largest number: " + sumOfLargest);
        System.out.println("Average of the three numbers: " + average);

        input.close();
    }
}
