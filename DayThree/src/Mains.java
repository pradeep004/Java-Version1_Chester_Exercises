
public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] singleArray = {4,2,1,3};
		int[][] multidimenstionArray ={
				{1,2,3,45},
				{3,4,1,2},
				{1,2,3,4}
		};
		
		
		for(int[] iter : multidimenstionArray){
			for(int i : iter) {
				System.out.println(i);
			}
			
		}
		
		
	}

}
