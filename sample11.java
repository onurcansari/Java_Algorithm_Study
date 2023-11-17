import java.util.Scanner;

public class sample11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entered The Number");
        int num = input.nextInt();
        System.out.println("Please enter the exponent of the number");
        int exponent = input.nextInt();
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *=num;

        }System.out.println("Your Result: " + result);

    }
}
