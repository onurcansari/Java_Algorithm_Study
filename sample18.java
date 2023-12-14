// Find the largest of the 10 numbers entered

import java.util.Scanner;

public class sample18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int large = 0;
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            if (num % 2 != 0 && large < num) {
                large = num;
            }
        }
        System.out.println("Largest Integer: " + large);
    }
}
