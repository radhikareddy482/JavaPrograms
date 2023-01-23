//Set a variable to final, to prevent it from being overridden/modified
/*The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).

The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

The final keyword is called a "modifier".
*/
public class FinalVariable {
	final String name = "Radhika";
	public static void main(String[] args) {
		FinalVariable student = new FinalVariable();
		//student.name = "raja";
		System.out.println(student.name);
	}

}
