package collections;

import java.util.*;  
public class LinkedHashSet{  
public static void main(String args[]){  
HashSet<String> set=new HashSet<String>();  
set.add("Ravina");  
set.add("Vijaya");  
set.add("Ria");  
set.add("Ananya");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
System.out.println(set.remove("Ravina")); 
System.out.println(set);

}  
}  