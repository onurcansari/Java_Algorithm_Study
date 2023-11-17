// Find the sum between two entered numbers

import java.util.Scanner;

public class sample16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Two Number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = 0;
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
        } else if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                sum += i;
            }
        }
        System.out.println("Your Sum: " + sum);

    }
}
