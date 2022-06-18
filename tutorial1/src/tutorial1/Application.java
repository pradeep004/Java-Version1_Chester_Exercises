package tutorial1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		float firstNum = 32e5f;
		System.out.println(firstNum);
		char myVar = 65;
		System.out.println(myVar);
		
		// String methods
		String newText = "my name is pradeep";
		System.out.println(newText.toUpperCase());
		System.out.println(newText.toLowerCase());
		
		//finding the index location
		System.out.println(newText.indexOf("e"));
		
		//String concatenation
		String firstName = "Pradeep";
		String lastName = "Angadageri";
		System.out.println(firstName+" "+lastName);
		System.out.println(firstName.concat(lastName));
		
		//switch statement
		int day = 4;
		switch(day) {
			case 1: 
				System.out.println("Monday");
			case 2:
				System.out.println("Tuesday");
			case 4:
				System.out.println("thrusday");
				break;
		}
	}

}
