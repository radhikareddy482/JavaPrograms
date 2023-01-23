class OuterClass{
	int x = 10;
class MyInner {
	int y = 20;

}}
public class InnerClass{
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		OuterClass.MyInner i = o.new MyInner();
		System.out.println(o.x+i.y);
		
	}
}
