// Show the sign of the entered number

import java.util.Scanner;

public class sample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        if (num == 0){
            System.out.println("This number is zero");
        }else if (num < 0){
            System.out.println("This number is negative");
        }else{
            System.out.println("This number is positive");
        }
    }
}
