import java.util.Arrays;

public class CopyArray2 {
	public static void main(String[] args) {
		String[] staffLastYear = {"Radhika","Reddy","Donthi"};
		String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length );
		staffLastYear[1] = "Raja";
		staffThisYear[2] = "Muskula";
		System.out.println(Arrays.toString(staffLastYear));
		System.out.println(Arrays.toString(staffThisYear));
	}

}
