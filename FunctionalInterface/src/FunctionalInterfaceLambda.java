interface A{
	public void add(int a, int b);
}
public class FunctionalInterfaceLambda {
	
	
	public static void main(String[] args) {
		FunctionalInterface f = new FunctionalInterface();
		A a = (a1, b1)->{
			System.out.println(a1+b1);
		};
		
	}

}
