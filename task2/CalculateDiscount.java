package task2;
import java.util.Scanner;

public class CalculateDiscount {
	public static double balanceAmount(double a) {
		if(a<500) {
			return a;
		
		}
		else if(a<=500 && a<=1000) {
			return a*0.09;
		}
		else {
			return a*0.08;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the amount of purchasing :");
		double n=sc.nextDouble();
		double result=balanceAmount(n);
		System.out.println("Amount after appaling discount :"+result);
		sc.close();

	}

}
