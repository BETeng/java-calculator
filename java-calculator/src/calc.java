import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		double num1 = scan.nextDouble();
		System.out.println(num1);
		
		System.out.println("Enter an operator");
		String op = scan.next();
		System.out.println(op);
		
		System.out.println("Enter a number");
		double num2 = scan.nextDouble();
		System.out.println(num2);
	}

}
