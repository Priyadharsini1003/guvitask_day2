package task2;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {

            for (int j = rows; j >= 1; j--) {
                System.out.print(Math.max(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

