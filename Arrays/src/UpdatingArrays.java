import java.util.Arrays;

/*
 toString method is to print one large array
 we can also replace the index element with other element
 once the array is created then we cannot resize it. so for that we need to create a array 
 */
public class UpdatingArrays {
	public static void main(String[] args) {
		String[] studentNames = {"Radhika","Reddy","Donthi"};
		studentNames[0] = "Raja";
		System.out.println(Arrays.toString(studentNames));
		String names[] = new String[5];
		for(int i = 0; i<studentNames.length;i++) {
			names[i]=studentNames[i];
			
		}
		names[3] = "AAshritha";
		names[4] = "AASHU";
		System.out.println(Arrays.toString(names));
		
	}

}
