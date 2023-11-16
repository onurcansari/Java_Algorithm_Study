import java.util.Scanner;

public class sample7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entered A Number");
        int num = input.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Result: " + sum);
    }
}
