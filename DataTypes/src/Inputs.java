import java.util.Scanner;
import java.math.*;
public class Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		String first_number = sc.nextLine();
		int first_no = Integer.parseInt(first_number);
		//System.out.println((first_no));	
		
		System.out.println("Enter firt symbol");
		String operator = sc.nextLine();
		//System.out.println(first_symbol);
		
		System.out.println("Enter the first number");
		String second_number = sc.nextLine();
		int second_no = Integer.parseInt(second_number);
		//System.out.println((second_no));
		
		/*System.out.println("Enter the first number");
		String second_symbol= sc.nextLine();
		//int first_no = Integer.parseInt(first_number);
		System.out.println((second_symbol));
		
		System.out.println("Enter the first number");
		String third_number = sc.nextLine();
		int third_no = Integer.parseInt(third_number);
		System.out.println((third_no));*/
		
		if ( operator.equals("+")) {
			System.out.println("The value of "+first_no+ "+" +second_no+ "=" +(first_no + second_no));
		}else if (operator.equals("-")) {
			System.out.println("The value of "+first_no+ "+" +second_no+ "=" +(first_no - second_no));
		}else if (operator.equals("-")) {
			System.out.println("The value of "+first_no+ "+" +second_no+ "=" +(first_no * second_no));
		}else if (operator.equals("-")) {
			System.out.println("The value of "+first_no+ "+" +second_no+ "=" +(first_no / second_no));
		}else {
			System.out.println("That was not a recongnised operator");
		}
		
	}

}
