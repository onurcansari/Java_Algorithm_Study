// Multiplication using addition

import java.util.Scanner;

public class sample15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entered The Number");
        int num = input.nextInt();
        System.out.println("Please Entered The Number To Multiply");
        int multiply = input.nextInt();
        int result = 0;
        for (int i = 0; i<multiply; i++){
            result +=num;
        }
        System.out.println("Result: " + result);
    }
}
