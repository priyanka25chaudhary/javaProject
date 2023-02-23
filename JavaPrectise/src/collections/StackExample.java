package collections;

import java.util.*;  
public class StackExample{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("Ayushi");     //To pushes (insert) an element onto the top of the stack.
stack.push("Garvita");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima");
stack.push("Priya");

//To remove the element from the top of the stack 
stack.pop();
System.out.println(stack);
System.out.println("_________________________________");    

//To checks the stack is empty or not.
boolean stk = stack.empty();  
System.out.println(stk);
System.out.println("_________________________________");

//To look at the top element of the stack without removing it.
String stk1 = stack.peek();  
System.out.println(stk1);
System.out.println("_________________________________");    

//TO search element in the stack 
int stk2 = stack.search("Priya");  
System.out.println(stk2);
System.out.println("_________________________________");    

//To print the size of the stack 
int stk3=stack.size();  
System.out.println(stk3);
System.out.println("_________________________________");    

//Iterating through iterator
Iterator itr = stack.iterator();  
while(itr.hasNext())  
{  
 Object stk4 = itr.next();  
System.out.println(stk4);   
}
System.out.println("_________________________________");    


//Iterating through for Each method 
stack.forEach(p ->  
{  
System.out.println(p);  
});
System.out.println("_________________________________");    

//Iterating through List Iterator 
ListIterator<String> ListItr = stack.listIterator(stack.size());  
while (ListItr.hasPrevious())   
{  
Object stk5 = ListItr.previous();  
System.out.println(stk5);  
}  
}  
}  
