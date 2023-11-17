import java.util.Scanner;

// Find the maximum and minimum values of 5 numbers

public class sample13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int large = -1;
        int small = num;
        for (int i = 0; i < 4; i++) {
            num = input.nextInt();
            if (large < num) {
                large = num;
            } else if (small > num) {
                small = num;
            }
        }
        System.out.println("Largest value: " + large);
        System.out.println("Smallest value: " + small);
    }
}
