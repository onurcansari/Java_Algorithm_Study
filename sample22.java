//Convert the given second value

import java.util.Scanner;

public class sample22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you want to convert");
        int num = input.nextInt();
        int section = num / 60;
        int remaining = num % 60;
        System.out.println(section + " Minute " + remaining + " Second");
    }
}
