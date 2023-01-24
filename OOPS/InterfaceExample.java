/*
 * An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.
Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.

There are mainly three reasons to use interface. They are given below.

It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.
 Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
 multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity.
 It is because its implementation is provided by the implementation class.
 */
interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
  
class InterfaceExample implements Printable, Showable{  
public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
InterfaceExample obj = new InterfaceExample();  
obj.print();  
 }  
}  