import java.util.ArrayList;

public class HnadlingMoreData {
	public void run() {
		ArrayList<String> color = new ArrayList<>();
		String[] colors = {"Red", "Blue","Yellow"};
		
		color.add("Red");
		color.add("Blue");
		color.add("bkue");
		color.add("black");
		
//		int i = 0;
//		while(i <color.size()) {
//			if (color.get(i).contains("e")) {
//				color.remove(i);
//				System.out.println(color.get(i));	
//			}
//			i++;
//			
//		}		
		for(String word : color) {
			if (!word.contains("e")) {
//				color.remove(word);
				System.out.println(word);
			}
			
		}
		
//		stringlist.add("Hello");
//		stringlist.add("world");
//		stringlist.add("HOw are you..?");
//		
////		System.out.println(Arraylist);
//		
//		int i = 0;
//		while(i < stringlist.size()) {
//			System.out.println(stringlist.get(i));
//			i++;
//		}
//		
//		for (String word : stringlist) {
//			System.out.println(word);
//			
//		}
		
		
//		Arrays are fixed in size and unodered 
		
		System.out.println(colors[1]);
		int i = 0;
		while(i< colors.length)
		{
			System.out.println(colors[i]);
			i++;
		}
	}

}
