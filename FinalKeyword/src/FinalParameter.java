//A method parameter declared with final keyword is known as final parameter. 
//Its value can’t be changed.
class Delta{
	public void add(final int a) {
		a = a*5;
		System.out.println(a);
	}
}
public class FinalParameter {
	public static void main(String[] args) {
		Delta number = new Delta();
		number.add(6);
		
	}

}
