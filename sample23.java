// Filling the Square Matrix with Fibonacci

import java.util.Scanner;

public class sample23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the square matrix");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        matrix[0][0] = a;
        matrix[0][1] = b;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int k = 2; k < n; k++) {
                    c = a + b;
                    matrix[0][k] = c;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    c = a + b;
                    matrix[i][j] = c;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            }
            System.out.println();

        }
    }
}
