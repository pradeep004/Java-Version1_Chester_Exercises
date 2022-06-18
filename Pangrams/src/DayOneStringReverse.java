import java.util.Arrays;
public class DayOneStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Are you as excited as I am?";
		String a = sentence.substring(0,sentence.length()-1);
		System.out.println(a);
		String reverseString ="";
		String words[] = a.split(" ");
		
		for (int i = words.length-1;i>=0; i-- ) {
			reverseString += words[i] + " ";
			
		
		}
		System.out.println("The reverse sentence is : "+reverseString.substring(0,1).toUpperCase()+ reverseString.substring(1).toLowerCase().trim()+"?");
		
	}

}
