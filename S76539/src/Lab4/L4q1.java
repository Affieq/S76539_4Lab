package Lab4;

import java.util.Scanner;

/**
 *
 * @author MP3_031
 */
public class L4q1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.print("Enter third number: ");
            double num3 = sc.nextDouble();
            double mean = (num1 + num2 + num3) / 3;
            double variance = (((num1 - mean) * (num1 - mean)) +
                    ((num2 - mean) * (num2 - mean)) +
                    ((num3 - mean) * (num3 - mean))) / 3;
            double standardDev = Math.sqrt(variance); // Corrected this line
            
            System.out.println("Mean is " + mean);
            System.out.println("Variance is " + variance);
            System.out.print("Standard Deviation is " + standardDev);
        }
    }
}
