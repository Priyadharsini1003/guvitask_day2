package task2;
import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int a) {
        int rev = 0;
        while (a != 0) {
            int result = a % 10; 
            rev = rev * 10 + result; 
            a /= 10; 
        }
        return rev;       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int n = sc.nextInt();
        int num = reverseNumber(n);
        System.out.println("Reversed number is: " + num);
        sc.close(); 
    }
}
