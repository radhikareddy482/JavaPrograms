/*A static variable declared with final keyword but not initialised at declaration time is known as static blank final variable. 
 * It can be initialised in a static block only.
 */
class Teacher{
	static final String name;
	static {
		name = "radhka";
		System.out.println(name);
		}
}
public class StaticFinalBlank {
	public static void main(String[] args) {
		Teacher names = new Teacher();
		
	}
	


}
