// Find the average of numbers until 5 enters

import java.util.Scanner;

public class sample8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        while (true) {
            int num = input.nextInt();
            if (num != 5) {
                sum += num;
                i++;
            } else {
                break;
            }

        }
        System.out.println(sum / i);

    }
}
