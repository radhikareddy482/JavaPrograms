//Constructor chaining is a process of calling a constructor from another constructor. 
//We can use this() to call same class constructor and super() to call super class constructor.
/*
 * Constructor chaining is the process of calling one constructor from another constructor with respect to current object. 

One of the main use of constructor chaining is to avoid duplicate codes while having multiple constructor (by means of constructor overloading) and make code more readable.
 */
// using this keyword from same class
class ConstructorChaining
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class   
	ConstructorChaining()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
    ConstructorChaining(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
 
    // parameterized constructor 3
    ConstructorChaining(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
        // invokes default constructor first
        new ConstructorChaining();
    }
}
