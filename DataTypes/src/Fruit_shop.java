import java.util.Scanner;
public class Fruit_shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fruit name:");
		String fruit = sc.nextLine();
		switch (fruit) {
		case "Apple":
			System.out.println("The price of apple is 20$");
			break;
		case "Grapes":
			System.out.println("The price of Grapes is 3$");
			break;
		case "banana":
			System.out.println("The price of banana is 2$");
			break;
		case "orange":
			System.out.println("The price of orange is 5$");
			break;
		default:
			System.out.println("THe price of other fruit is 21$");
			break;
		}
	}

}
