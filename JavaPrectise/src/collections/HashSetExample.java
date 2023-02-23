package collections;

import java.util.*;  
public class HashSetExample{  
public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("Riya");  //Duplication is not allowed 
set.add("Vijaya");  
set.add("Neha");  
set.add("Arti");
set.add("Sonal");
set.add("Shreya");
System.out.println(set);
System.out.println("________________________________________");

//To remove specific element from HashSet  
set.remove("Arti");  
System.out.println(set);
System.out.println("________________________________________");

// To check is empty 
System.out.println(set.isEmpty());
System.out.println("________________________________________");

//To check is contains 
System.out.println(set.contains("Priya"));
System.out.println("________________________________________");

//To print the size of the stack 
int set1=set.size();  
System.out.println(set1);
System.out.println("________________________________________");    

//To clone 
System.out.println("Original HashSet:"+set);
System.out.println("Cloned HashSet:"+set.clone());
System.out.println("________________________________________");


//Iterating through for Each method 
set.forEach(p ->  
{  
System.out.println(p);  
});
System.out.println("________________________________________");    

 

}  
}  
  
