import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
	

		
		
		
	
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the number of comletions: ");
		int COMP = input.nextInt();
		
		System.out.print("Enter the number of passing attempts: ");
		int ATT = input.nextInt();
		
		System.out.print("Enter the number of passing yards: ");
		double YRDS = input.nextDouble();
		
		System.out.print("Enter the number of Touchdown passes: ");
		int TD = input.nextInt();
		
		System.out.print("Enter the number of interceptions: ");
		int INT = input.nextInt();
	
		
		
		
		
		double a = (COMP / ATT- 0.3)* 5;
		double b = ((YRDS / ATT - 0.3) * .25);
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INT / ATT) * 25);
		
	    double Pass_Rt = (((a + b + c + d) / 6) * 100);
		
		
		System.out.printf("Their passer rating is: %.2f ", Pass_Rt);
		
		
	}
		
		
		
		
	
	

}
