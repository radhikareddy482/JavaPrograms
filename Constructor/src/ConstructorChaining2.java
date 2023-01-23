class Base
{
    String name;
 
    // constructor 1
    Base()
    {
        this("");
        System.out.println("No-argument constructor of" +
                                           " base class");
    }
 
    // constructor 2
    Base(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                                              + " of base");
    }
}
 
class ConstructorChaining2 extends Base
{
    // constructor 3
    ConstructorChaining2()
    {
        System.out.println("No-argument constructor " +
                           "of derived");
    }
 
    // parameterized constructor 4
    ConstructorChaining2(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                           "constructor of derived");
    }
 
    public static void main(String args[])
    {
        // calls parameterized constructor 4
        ConstructorChaining2 obj = new ConstructorChaining2("test");
 
        // Calls No-argument constructor
        // Derived obj = new Derived();
    }
}

