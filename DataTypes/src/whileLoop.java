import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("How many times would you like to iterate..?");
//		int i = sc.nextInt();
//		while (i<20) {
//			System.out.println(i);
//			i++;
//				
//		System.out.println("----------------------------/n");
//		}
		
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
			
			System.out.println("enter the value");
			String input = sc.nextLine();
			if (input.equals("stop"));{
				break;
			}
		
			
		}
		
	}

}
