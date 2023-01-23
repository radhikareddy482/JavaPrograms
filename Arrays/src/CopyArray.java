import java.util.Arrays;

/*
 Trap: Setting an array variable equal to another
 PitFall: Both variables point to the same array
 Set it equal to a copy of the array
 */
public class CopyArray {
	public static void main(String[] args) {
		String[] staffLastYear = {"Radhika","Reddy","Donthi"};
		String[] staffThisYear = staffLastYear;
		//Here index 1 of staffLastYear is updated so it is also updated in staffThisYear to avoid this trap copy of array method is used
		
		staffLastYear[1] = "AASHU";
		System.out.println(Arrays.toString(staffLastYear));
		System.out.println(Arrays.toString(staffThisYear));
		
	}

}
