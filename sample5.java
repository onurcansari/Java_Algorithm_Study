// Factorial calculation

import java.util.Scanner;

public class sample5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long value = 1;
        System.out.println("Please enter the number to find the factorial:");
        int factorial = input.nextInt();
        for (int i = 1; i <= factorial; i++) {
            value *= i;
        }
        System.out.println("Factorial: " + value);
    }
}
