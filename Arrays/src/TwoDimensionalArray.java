
public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] grades= {
				{12, 24, 36, 48},
				{2, 4, 6, 8},
				{3, 6, 9, 12},
				{1, 2, 3, 4}
		};
		for(int i = 0; i<grades.length; i++) {
			for(int j = 0; j<grades[i].length; j++) {
				System.out.println(grades[i][j]);
			}
			System.out.println("/n");
		}
	}

}
