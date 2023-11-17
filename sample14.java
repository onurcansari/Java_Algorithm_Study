// Division using subtraction

import java.util.Scanner;

public class sample14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter the number to divide");
        int num = input.nextInt();
        System.out.println("Enter the divisor");
        int divisor = input.nextInt();
        while (num > 0) {
            num -= divisor;
            result++;
        }
        if (num < 0) {
            num += divisor;
            result--;
        }
        System.out.println("Result: " + result);
        System.out.println("Remaining: " + num);
    }
}
