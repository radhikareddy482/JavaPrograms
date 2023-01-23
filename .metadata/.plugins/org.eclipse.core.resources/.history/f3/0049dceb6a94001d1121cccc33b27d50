/*In Java, a static class created inside a class is called a Java static nested class.

Can be accessed by outer class name.
Cannot access non-static data members and methods.
Can access static data members of outer class including private.
Cannot access non-static (instance) data members or methods.
*/
class Temple{
	static String name= "krishna";
	
	static class God{
		public void show() {
		System.out.println(name);
		
	}}
}
public class StaticNestedClass {
	public static void main(String[] args) {
		Temple.God obj = new Temple.God();
		obj.show();
		
	}
	

}
