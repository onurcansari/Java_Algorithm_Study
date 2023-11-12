import java.util.Scanner;

public class sample1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = input.nextLine();
        int count = 0;
        while(count <= 5){
            System.out.println(name);
            count++;
        }
    }
}
