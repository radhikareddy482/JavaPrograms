/*In a Java class, a static block is a set of instructions that is run only once when a class is loaded into memory. 
 * A static block is also called a static initialization block. This is because it is an option for initializing or setting up the class at run-time. The keyword 'static' indicates that it spans all instances of the class. 
 * It is like a mini-global set of instructions.
 */
/*On the other hand, constructors are run EACH time a new instance of a class is created. 
 * You can overload a constructor, meaning that multiple versions of the constructor can be created. 
 * Each one has to have a different number of parameters, but, otherwise, they can all be named the same. 
 * Let's look at some examples. We'll add the constructor after the static block statements.
 */
//Finally, when we create an instance of the class in the main program, the given constructor is called. 
//However, the static block only loads once in memory. 
class Fruits{
	static {
		System.out.println("radhika reddy");
	}
	public void fruits() {
		System.out.println("Apple");
	}
}
public class StaticBlockvsConstructor {
	public static void main(String[] args) {
		Fruits f = new Fruits();
		f.fruits();

		
	}
	
}
