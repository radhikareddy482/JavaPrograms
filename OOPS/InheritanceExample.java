class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
public class InheritanceExample extends A,B{
 public static void main(String args[]){  
   InheritanceExample obj=new InheritanceExample();  
   obj.msg(); 
}  
} 
