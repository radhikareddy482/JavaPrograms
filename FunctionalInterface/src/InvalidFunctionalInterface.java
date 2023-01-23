//A functional interface can extends another interface only when it does not have any abstract method.
interface syable{
	abstract void say(String msg);
}
interface Doable extends syable{
	void doIt();
}
public class InvalidFunctionalInterface{
	public static void main(String[] args) {
		
	}
}

