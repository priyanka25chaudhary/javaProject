package collections;

import java.util.*;  
public class VectorExample {  
       public static void main(String args[]) {  
          //Create a vector  
          Vector<String> vector = new Vector<String>();  
          //Adding elements  
          vector.add("Riya");  //to insert the specified element in the given Vector
          vector.add("Priya");  
          vector.add("Dora");  
          vector.add("Neha");  
          //Adding elements 
          vector.addElement("sonal");  //to add the specified element to the end of this vector
          vector.addElement("komal");  
          vector.addElement("kia");  
            
          System.out.println(vector); 
          
          System.out.println("____________________________________________________");
          
          //The capacity() method of Java Vector class is used to 
          //get the current capacity of the vector which is in use
          
          System.out.println("capacity of Vector : "+vector.capacity()); // find the size of vector
          
          System.out.println("____________________________________________________");

          // clone() method is used to get a clone of the vector which is in use
          System.out.println("Original vector: "+vector);        
          System.out.println("Cloned vector: "+vector.clone()); 
          
          System.out.println("____________________________________________________");

          //The containsAll() method is used to check the vector 
          //which is in use contains all of the elements in the specified Collection or not
          
          System.out.println(vector.contains("komal"));  
          
          System.out.println("____________________________________________________");
          
          //To remove element 
          System.out.println(vector.remove(1));  
          System.out.println("____________________________________________________");


          //To get the element in the enumeration  
          Enumeration<String> enu = vector.elements();  
          System.out.println("enumeration object: ");  
          while (enu.hasMoreElements())   
          {             
              System.out.println(enu.nextElement());  
          }  
          
                   
          
          
       }  
}  
