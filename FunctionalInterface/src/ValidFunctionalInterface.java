//In the following example, a functional interface is extending to a non-functional interface.
//Java provides predefined functional interfaces to deal with functional programming by using lambda and method references.

//You can also define your own custom functional interface. Following is the list of functional interface which are placed in java.util.function package.
interface Employee{
	default void details() {
		System.out.println("employee details");
	}
}
interface Manager extends Employee{
	abstract void name(String msg);
}
public class ValidFunctionalInterface {
	public void name(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		ValidFunctionalInterface v = new ValidFunctionalInterface();
		v.name("hello there");
	}

}
