package collections;

import java.util.*;  
public class ArrayListExample2{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Priya");  
  al.add("Riya");  
  al.add("Neha");  
  al.add("Kamal");  
  //accessing the element    
  System.out.println(al.get(1));//it will return the 2nd element 
  
  System.out.println("____________________________________________");
  
  //changing the element  
  al.set(1,"Komal");
  //removing the element 
  al.remove(2);
  System.out.println(al);
  System.out.println("____________________________________________");
  
  //TO retain all 
  al.retainAll(al); 
  System.out.println(al);
  System.out.println("____________________________________________");
  
  //To check is contains 
  System.out.println(al.contains("Neha"));
  
  // To check is empty 
  System.out.println(al.isEmpty());
  
  //Traversing list for each
  for(String names:al)    
    System.out.println(names);
  System.out.println("_____________________________________________");
  
  //Traversing list through iterator
  
 Iterator itr = al.iterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
 
 }
 System.out.println("_____________________________________________");

  //Sorting the list 
 Collections.sort(al);
 System.out.println(al);
 System.out.println("_____________________________________________");

 
 //Traversing through reverse order
 ListIterator<String> list1=al.listIterator(al.size()); 
 while(list1.hasPrevious()) {
	 String str1 = list1.previous();
	 System.out.println(str1);
	 	 
 }
 System.out.println("_____________________________________________");
 //Traversing list through for loop 
 for(int i=0;i<=al.size()-1;i++) {
	 System.out.println(al.get(i));
	 
 }
 System.out.println("______________________________________________");
//Traversing through for each() using lambda expression
 //(It helps to iterate, filter and extract data from collection)

 al.forEach(a->{
	 System.out.println(a);
	 
 });
 System.out.println("________________________________________________");
 
 //Traversing through forEachRemaining() method
 Iterator<String> itr3 = al.iterator();
 itr3.forEachRemaining(a->{
	 System.out.println(a);
 });
 
 
 
  
  
  
  
  
  
  
  
  
 }  
}  
