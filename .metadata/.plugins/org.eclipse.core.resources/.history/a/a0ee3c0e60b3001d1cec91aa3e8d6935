package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collection1 {

	public static void main(String[] args) {
		System.out.println("Collection 1");
		
		/*
		 creating collection: 
		 
		 1. Type safe - same type of elements are added to collection 
		 
		 2. Un-type safe collection - different type of element can be added to collection 
		 
		 */
		 
	     // 1.type safe collection :
		 // creating ArrayList: 
		/*
		 ArrayList : Java ArrayList class uses a dynamic array for storing the elements. 
		 It is like an array, but there is no size limit.
		 */
		ArrayList<String> names=new ArrayList<String>(); // It creates an empty array in the memory 
		names.add("priya");
		names.add("neha");
		names.add("riya");
		names.add("neha");
		System.out.println(names.get(0)); // indexed collection is shown here
		System.out.println(names.get(1));
		
		System.out.println("______________________________________________________________");
		System.out.println("                                                               ");

		// 2. Un-type safe collection :
		   
		   // creating LinkedList:
		LinkedList<float> list=new LinkedList<float>();
		list.add(100);
		list.add(200);
		list.add(201.67);
		list.add(2.36);
		System.ou.println(list);
		
		System.out.println("Size = "+names.size());  // to find the size of the list 
		System.out.println("Size = "+list.size());
		
		System.out.println(names.contains("supriya")); // to check if the item is present in the list or not
		System.out.println(list.contains(200));        // it calls equals method of type for checking 
		
		System.out.println(names.isEmpty()); // to check if the element is empty or not
		
		names.set(2,"kamal");     // to update an element to the particular position in the list 
		System.out.println(names);
		
		names.add(3,"rahul");     // to add element in the list 
		System.out.println(names);
		
		System.out.println("______________________________________________________________");
		System.out.println("                                                               ");

		// creating vector:
		Vector<String> vector=new Vector<String>();
		vector.addAll(names);       // addAll method will add all element in vector
		System.out.println(vector);
		
		
		System.out.println("______________________________________________________________");
		System.out.println("                                                               ");
		
		// creating stack:
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayushi");  
		stack.push("Garima");  
		stack.push("Amita");  
		stack.push("Arshi");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		System.out.println("______________________________________________________________");
		System.out.println("                                                               ");

		
		// creating Queue :
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amita");  
		queue.add("Riya");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr1=queue.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		queue.remove();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		} 
		
		System.out.println("______________________________________________________________");
		System.out.println("                                                               ");

  


		
		// creating HashSet
		HashSet<Double> values=new HashSet<Double>();  // Implementation class of set and order is not preserved 
		values.add(22.34);
		values.add(456.235);
		values.add(87.5);          // Duplication is not allowed
		values.add(87.5);
		System.out.println(values);
		
		System.out.println("______________________________________________________________");
		System.out.println("                                                               ");

		// creating TreeSet
		TreeSet<Double> tree=new TreeSet<Double>();  // It provides sorting functionalities to set 
		tree.addAll(values);
		System.out.println(tree);
		
		System.out.println("______________________________________________________________");
		System.out.println("                                                               ");

		
		
		
		
		
						
		
		}

}


