import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the first value:");
		int first_no = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the operator");
		String operator = sc.nextLine();
		
		System.out.println("Enter the second value");
		int second_no = sc.nextInt();
		Operators o1 = new Operators();
		
		
		switch (operator) {
		case "+":
			o1.addition(first_no, second_no);
			break;
			
		case "-":
			o1.substraction(first_no, second_no);
			break;
		case "*":
			o1.multiplication(first_no, second_no);
			break;
			
		case "/":
			o1.devision(first_no, second_no);
			break;
			
		}
	}

}
