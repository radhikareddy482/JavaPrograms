//A static method can be accessed without creating an object of the class first
class Employee{
	static void show() {
		System.out.println("radhika reddy");
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		Employee name = new Employee();
		name.add(1, 2);
		Employee.show();
		
	}
	

}
