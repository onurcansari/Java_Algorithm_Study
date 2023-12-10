// Convert Fahrenheit to Celsius

import java.util.Scanner;

public class sample21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you want to convert");
            int num = input.nextInt();
            int celcius = 5 / 9 * (num - 32);
            System.out.println(celcius);
    }
}
