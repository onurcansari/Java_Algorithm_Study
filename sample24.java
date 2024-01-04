// Triangle pattern with numbers

import java.util.Scanner;

public class sample24 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entered A Number");
        int num = input.nextInt(); // The length of the pattern will be determined
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}