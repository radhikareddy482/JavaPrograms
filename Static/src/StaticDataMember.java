/*Data members declared with static keyword are generally known as static data members. 
These are primarily used to characterize these properties that are common to each object. 
On the time of class loading a single copy is created for static data members and it will be shared by all objects.
Memory division in a java program execution.
In a java program execution memory is divided into three parts:
	Stack: It is used to store local variables of the methods.
	Heap: It is used to store objects.
	Class Area: It is used to store static data members.
	Static data members are used to represent common properties of each object.
	*/
class Subject{
	static String name = "English";
	int rollNo;
	public void subjectName(int roll) {
		rollNo = roll;
		System.out.println("rollNo");
		System.out.println(name);
		 
	}
}
public class StaticDataMember {
	public static void main(String[] args) {
		Subject s = new Subject();
		s.subjectName(29);
		
	}

}
