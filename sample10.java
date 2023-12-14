// Write the opposite of a binary number

import java.util.Scanner;

public class sample10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binaryNum = input.next();
        String opposite = "";
        for (int i = 0; i < binaryNum.length(); i++) {
            char a = binaryNum.charAt(i);
            if (a == '1') {
             opposite  += '0';
            }
            if (a == '0'){
                opposite += '1';
            }
        }
        System.out.println(opposite);
    }
}
