//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
//	It can be used to set initial values for object attributes
//The way of defining multiple constructor with different arguments in a specified class is called constructor overloading. 
//Parameters can differ in type, number or order.
public class ConstructorOverloading{
       int rollNo;
       boolean isStudent;
       String name;
 
 
       //One argument constructor
       ConstructorOverloading(boolean isStudent ){
       System.out.println("One argument constructor called.");
          this.isStudent = isStudent ;
       }               
 
       //Two argument constructor
       ConstructorOverloading(int rollNo, String name){
        System.out.println("Two argument constructor called.");
        this.rollNo = rollNo;
        this.name = name;
       }    
 
       //Three argument constructor
       ConstructorOverloading(boolean isStudent, int rollNo, String name){
         System.out.println("Three argument constructor called.");
         this.isStudent = isStudent ;
         this.rollNo = rollNo;
         this.name = name;
        }
       public static void main(String args[]){
         //one argument constructor call
         ConstructorOverloading obj1 = new ConstructorOverloading(true);
 
         //print values of object properties.
         System.out.println("isStudent = " + obj1.isStudent);
         System.out.println("Roll No = " + obj1.rollNo);
         System.out.println("Name = " + obj1.name); 
 
         //two argument constructor call
         ConstructorOverloading obj2 = new ConstructorOverloading(11, "Jai");
 
          //print values of object properties.
          System.out.println("isStudent = " + obj2.isStudent);
          System.out.println("Roll No = " + obj2.rollNo);
          System.out.println("Name = " + obj2.name);
 
          //three argument constructor call
          ConstructorOverloading obj3 = new ConstructorOverloading(true, 22, "Roxy");
 
          //print values of object properties.
          System.out.println("isStudent = " + obj3.isStudent);
          System.out.println("Roll No = " + obj3.rollNo);
          System.out.println("Name = " + obj3.name);
        }
}