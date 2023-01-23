import java.util.Arrays;

//By using for loop we can copy the array without updating the original array
public class CopyArray1 {
	public static void main(String[] args) {
		
	
	String[] staffLastYear = {"Radhika","Reddy","Donthi"};
	String[] staffThisYear = new String[3];
	for(int i = 0; i<staffLastYear.length; i++) {
		staffThisYear[i] = staffLastYear[i];
		
	}
	staffLastYear[1] = "Raja";
	System.out.println(Arrays.toString(staffLastYear));
	System.out.println(Arrays.toString(staffThisYear));

}}
