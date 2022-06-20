import java.util.Arrays;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multidimensionArray = { { 1, 6, 9, 6, 3 }, { 2, 11, 7, 4, 8 }, { 9, 0, 1, 8, 3 } };
		for (int[] iter :multidimensionArray) {
			Arrays.sort(iter);
			for(int i :iter) {
			System.out.println(i);
			}
		}		
					
	}

}
