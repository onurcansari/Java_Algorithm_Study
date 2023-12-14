// Printing the entered name 61 times

import java.util.Scanner;

public class sample1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = input.nextLine();
        int i = 0;
        while(i <= 61){
            System.out.println(name);
            i++;
        }
    }
}
