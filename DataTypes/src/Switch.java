
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day = "MOnday";
		
		switch (day) {
		case "Monday":
			System.out.println("Start of fresh week");
			break;
		case "Tuesday":
			System.out.println("Shooping");
			break;
		case "wednesday":
			System.out.println("Midweek");
			break;
		case "Thursday":
			System.out.println("planninbg for weekend");
			break;
		case "Friday":
			System.out.println("Eye on the time");
			break;
		default :
			System.out.println("It's weekend");
			break;
		}
	}

}
