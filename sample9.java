import java.util.Random;
import java.util.Scanner;

public class sample9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
            int value = random.nextInt(49) + 1;
            int i = 0;
            while (true) {
                int num = input.nextInt();
                if (num < value) {
                    System.out.println("Enlarge Number");
                    i++;
                } else if (num > value) {
                    System.out.println("Minimize Number");
                    i++;
                } else {
                    System.out.println("You Find The Number");
                    i++;
                    break;
                }
            }
            System.out.println("You Find it in Step " + i);
        
    }
}
