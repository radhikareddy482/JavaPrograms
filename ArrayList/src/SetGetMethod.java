import java.util.*;
public class SetGetMethod{  
 
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
              al.add("A");    
              al.add("B");    
              al.add("C");    
              System.out.println("Before update: "+al.get(1));   
              //Updating an element at specific position  
              al.set(1,"D");  
              System.out.println("After update: "+al.get(1));   
        }
    }         
