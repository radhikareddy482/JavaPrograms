/*Instance initializer block is a mechanism provided by java compiler to define a group of statements common to all constructors at a single place. 
At the compilation time, compiler moves these statements at the beginning of all constructors after super. 
It is can also be used to initialize the instance variable.
*/
class Movie{
	String b,name;
	{
		 name = "Bhubali";
	}
	Movie(){
		System.out.println("radhika");
	}
	Movie(String names){
		b = names;
		
		
	}
	public void show(){
		System.out.println(name);
		System.out.println(b);
	}
	
}

public class InstanceBlock {
	public static void main(String[] args) {
		Movie m = new Movie();
		m.show();
		Movie n = new Movie("rani");
		n.show();
		
		
		
		
	}

}
