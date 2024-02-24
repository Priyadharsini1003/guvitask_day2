package task2;
import java.util.Scanner;

public class FindSmallestNumber {
	
	public static void campare(int a,int b,int c) {
	
		if(b<a) {
			System.out.println(" b is smallest number");
		}
		else if(c<a) {
			System.out.println(" c is smallest number");
		}
		else {
			System.out.println(" a is smallest number");
		}
			
		
	}

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
           System.out.println("enter first number as a:");
           int x=sc.nextInt();
           System.out.println("enter second number as b:");
           int y=sc.nextInt();
           System.out.println("enter three number as c:");
           int z=sc.nextInt();
           
           campare(x,y,z);
           sc.close();
           
	}

}
