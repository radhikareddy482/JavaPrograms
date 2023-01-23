//In java, a class declared with final keyword is called as final class. 
//Inheritance is not possible with final class. 
final class Student{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
}
class StudentName extends Student{
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
}
public class FinalClass {
	public static void main(String[] args) {
		StudentName name = new StudentName();
		name.add(2,4);
		name.sub(4, 2);
		Student college = new Student();
		college.add(3, 5);
		
	}
	

}
