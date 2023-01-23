//In java, final methods are declared with final keyword. We can not override the final methods.

class Employee{
	public final void show() {
		System.out.println("employee");
	}
}
class Manager extends Employee
{
	public void show() {
		System.out.println("Manager");
	}
}
public class FinalMethod {
	public static void main(String[] args) {
		Manager name = new Manager();
		name.show();
	}

}
