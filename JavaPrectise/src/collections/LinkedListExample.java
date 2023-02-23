package collections;

import java.util.*;  
public class LinkedListExample{  
 public static void main(String args[]){  
  
  LinkedList<String> list=new LinkedList<String>();  
  list.add("Riya");  
  list.add("Priya");  
  list.add("Neha");  
  list.add("Supriya");
  list.add("Sonal");
  
  Iterator<String> itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }
  System.out.println("_______________________________________________");
  
  
  // Removing element 
  list.remove("Riya");  
  System.out.println(list);
  System.out.println("_______________________________________________");

  
  //Reversing element
  Iterator itr1 = list.descendingIterator();  
  while(itr1.hasNext())  
  {  
      System.out.println(itr1.next());  
  }
  System.out.println("____________________________________________");

  //changing the element  
  list.set(1,"Kia");
  

  //removing the element 
  list.remove(2);
  System.out.println(list);
  System.out.println("____________________________________________");
  
  //TO retain all 
  list.retainAll(list); 
  System.out.println(list);
  System.out.println("____________________________________________");

//To check is contains 
  System.out.println(list.contains("Neha"));
  
  // To check is empty 
  System.out.println(list.isEmpty());
  
  //Traversing list for each
  for(String names:list)    
    System.out.println(names);
  System.out.println("_____________________________________________");
  
  //Traversing list through iterator
  
 Iterator itr2 = list.iterator();
 while(itr2.hasNext()) {
	 System.out.println(itr2.next());
 
 }
 System.out.println("_____________________________________________");

  //Sorting the list 
 Collections.sort(list);
 System.out.println(list);
 System.out.println("_____________________________________________");

 
 //Traversing through reverse order
 ListIterator<String> list1=list.listIterator(list.size()); 
 while(list1.hasPrevious()) {
	 String str1 = list1.previous();
	 System.out.println(str1);
	 	 
 }
 System.out.println("_____________________________________________");
 //Traversing list through for loop 
 for(int i=0;i<=list.size()-1;i++) {
	 System.out.println(list.get(i));
	 
 }
 System.out.println("______________________________________________");
//Traversing through for each() using lambda expression
 //(It helps to iterate, filter and extract data from collection)

 list.forEach(a->{
	 System.out.println(a);
	 
 });
 System.out.println("________________________________________________");
 
 //Traversing through forEachRemaining() method
 Iterator<String> itr3 = list.iterator();
 itr3.forEachRemaining(a->{
	 System.out.println(a);
 });
 

  
  
  
  
  
  
  
  
  
  
  
 }  
}  