import java.util.Scanner;

public class sample6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entered First Number");
        int num1 = input.nextInt();
        System.out.println("Please Entered Second Number");
        int num2 = input.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("Now Your First Number: " + num1 + " Your Second Number: " + num2);

    }
}
