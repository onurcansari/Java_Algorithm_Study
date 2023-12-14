// Calculate the factorial of numbers up to the entered number

import java.util.Scanner;

public class sample19 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please Entered A Number");
        int num = input.nextInt();
        int result = 1;
        for (int i = 0; i <=num; i++){
            for (int j = 1; j <=i; j++){
                result *= j;
               
            } 
            System.out.println(i+"! : " + result);
            result = 1;
        } 
    }
    
}
