import java.util.Scanner;

public class sample4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the side lengths of the triangle respectively.");
        int length1 = input.nextInt();
        int length2 = input.nextInt();
        int length3 = input.nextInt();
        if (length1 == length2 && length1 == length3){
            System.out.println("This triangle is a equilateral");
        }
        else if (length1 == length2 || length1 == length3 || length2 == length3){
            System.out.println("This triangle is a isosceles");
        }
        else {
            System.out.println("This is a scalene triangle");
        }

    }
}
