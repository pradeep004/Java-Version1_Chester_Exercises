
public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sixty ziers were quickly icked from the woven jute bag.";
		boolean everyLetter = true;
		
		for (char ch = 'a'; ch <='z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				everyLetter = false;
				break;
			}
		
		}
		if (everyLetter) {
			System.out.println("The sentence is Pangram");
			
		}else {
			System.out.println("The sentence is not pangram");
		}
		
	}

}
