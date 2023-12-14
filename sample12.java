// Sum of numbers up to the entered number

import java.util.Scanner;

public class sample12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entered The Number");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Your First Sum: " + sum);

        // Or Like This

        sum = num * (num + 1) / 2;
        System.out.println("Your Second Sum: " + sum);

    }
}
