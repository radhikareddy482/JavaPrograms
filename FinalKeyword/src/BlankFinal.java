/*A variable declared with final keyword but not initialised at declaration time is known as blank final variable. 
 * They are initialised at the time of object creation in constructor and can’t change after that.
 */
class Car{
	final String name;
	Car(String names){
		name = names;
		System.out.println(name);
	}
	
}
public class BlankFinal {
	public static void main(String[] args) {
		 new Car("radhika");
		
	}

}
