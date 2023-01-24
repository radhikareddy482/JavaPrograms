/*
 * Getter and Setter are methods used to protect your data and make your code more secure.
 *  Getter returns the value (accessors), it returns the value of data type int, String, double, float, etc. For the program’s convenience, getter starts with the word “get” followed by the variable name.

While Setter sets or updates the value (mutators). 
It sets the value for any variable used in a class’s programs. and starts with the word “set” followed by the variable name. Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.
 In both getter and setter, the first letter of the variable should be capital.
 */
import java.io.*;
 

class GetSet {
 
    // Member variable of this class
    private String name;
 
    
    public String getName() { return name; }
 
    
    public void setName(String N)
    {
 
        // This keyword refers to current instance itself
        this.name = N;
    }
}
 
// Class 2
// Main class
class SettersGetters {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of class 1 in main() method
        GetSet obj = new GetSet();
 
        // Setting the name by calling setter method
        obj.setName("Geeks for Geeks");
        // Getting the name by calling getter method
        System.out.println(obj.getName());
    }
}