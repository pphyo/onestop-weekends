public class ArrayTest {

	public static void main(String[] args) {
		
		int[][] dimen = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12, 13, 14},
			{1, 2, 3, 4},
			{1, 2, 3, 4},
		};

		for(int i = 0; i < dimen.length; i++) {
			for(int j = 0; j < dimen.length; j++) {
				System.out.println(dimen[i][j]);
			}
			System.out.println();
		}

	}
	
}