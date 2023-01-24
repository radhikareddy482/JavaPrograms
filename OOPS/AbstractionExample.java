/*
 * A class which is declared with the abstract keyword is known as an abstract class in Java. 
 * It can have abstract and non-abstract methods (method with the body).

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. 
You don't know the internal processing about the message delivery.
There are two ways to achieve abstraction in java

Abstract class (0 to 100%)
Interface (100%)
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
 */
  
 abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
 
 class Honda extends Bike{  
 void run(){System.out.println("running safely..");}  
 }  
 
 class AbstractionExample{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  
