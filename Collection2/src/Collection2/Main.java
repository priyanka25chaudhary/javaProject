package Collection2;

// import util. package(all classes)
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Collection 2");

		/*
		 creating collection:

		 1. Type safe - same type of elements are added to collection

		 2. Un-type safe collection - different type of element can be added to collection

		 */

        // 1.type safe collection :

        // creating ArrayList:
        ArrayList<String> names=new ArrayList<String>();  // we can only enter string type in names variable
        names.add("priya");
        names.add("neha");
        names.add("riya");
        names.add("neha"); // Duplication is allowed
        System.out.println(names);
        System.out.println(names.get(0)); // indexed collection is shown here
        System.out.println(names.get(1));

        // 2. Un-type safe collection :

        // creating LinkedList:
        LinkedList list=new LinkedList();
        list.add("shreya");
        list.add(200);
        list.add(201.67);
        list.add(true);
        System.out.println(list);

        System.out.println("Size = "+names.size());  // to find the size of the list
        System.out.println("Size = "+list.size());

        System.out.println(names.contains("supriya")); // to check if the item is present in the list or not
        System.out.println(list.contains(200));        // it calls equals method of type for checking

        System.out.println(names.isEmpty()); // to check if the element is empty or not

        names.set(2,"kamal");     // to replace element in list
        System.out.println(names);

        names.add(3,"rahul");     // to add element in the list
        System.out.println(names);


        // creating vector:
        Vector<String> vector=new Vector<String>();
        vector.addAll(names);       // addAll method will add all element in vector
        System.out.println(vector);






    }

}
