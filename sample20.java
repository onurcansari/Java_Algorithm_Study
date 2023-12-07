// Find the value of an entered binary number

import java.util.Scanner;

public class sample20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int step = 1;
        System.out.println("Please Entered A Binary Number");
        String binary = input.next();
        for (int i = binary.length() - 1; i >= 0; i--) {
            char ch = binary.charAt(i);
            int x = Character.getNumericValue(ch);
            result = result + (x * step);
            step *= 2;
        }
        System.out.println(result);
    }
}
