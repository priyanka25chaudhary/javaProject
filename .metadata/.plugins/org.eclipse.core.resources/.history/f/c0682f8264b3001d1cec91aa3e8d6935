package collections;

import java.util.ArrayList;  // Traverse means we have to get each element one by one and perform operation on them 
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse2 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>(); // It creates an empty array in the memory 
		names.add("priya");
		names.add("neha");
		names.add("riya");
		names.add("neha");
		System.out.println(names.get(0)); // indexed collection is shown here
		System.out.println(names.get(1));

		System.out.println("______________________________________________");
        System.out.println("                                              ");
		
        // for-each traversing
		for(String str: names)
		{
			System.out.println(str);
		}
	    
        System.out.println("______________________________________________");
        System.out.println("                                              ");
		
        // Traversing through Iterator 
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		
		System.out.println("______________________________________________");
        System.out.println("                                              ");
		
	    //Traversing through ListIterator
		ListIterator<String> itr1 = names.listIterator(names.size());
		while(itr1.hasPrevious())
		{
			String previous = itr1.previous();
			System.out.println(previous);
		}
		
		System.out.println("______________________________________________");
        System.out.println("                                              ");

		
		// Traversing through for each method
		names.forEach(e->{
			System.out.println(e);
			
		}); 
		
		System.out.println("______________________________________________");
        System.out.println("                                              ");
		
		// Sorting of element
		TreeSet<String> set=new TreeSet<String>();  
		set.addAll(names);
		set.forEach(e->{
			System.out.println(e);
		});
		
		//Comparable
		//Comparator
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
