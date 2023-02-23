/*StringBuffer class is used to create mutable (modifiable) String objects. 
 * The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
 */

package StringPrograms;

class StringBufferExample {
	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("Hello");
		
		//The append() method concatenates the given argument with this String
		s.append("Java");// now original string is changed
		System.out.println(s);
		System.out.println("_________________________________");
		

		//The insert() method inserts the given String with this string at the given position.
		s.insert(1,"Java");
		System.out.println(s);
		System.out.println("_________________________________");
		
		
		//The replace() method replaces the given String from the specified beginIndex and endIndex.
		s.replace(1,3,"Java");  
		System.out.println(s);
		System.out.println("_________________________________");
		
		
		//The delete() method deletes the String from the specified beginIndex to endIndex
		s.delete(1,3);  
		System.out.println(s);
		System.out.println("_________________________________");
		
		
		//The reverse() method of the StringBuilder class reverses the current String
		s.reverse();  
		System.out.println(s);
		System.out.println("_________________________________");
		
		
		
		//capacity() method of the StringBuffer class returns the current capacity of the buffer. 
		//The default capacity of the buffer is 16. 
		//If the number of character increases from its current capacity, 
		//it increases the capacity by (oldcapacity*2)+2
		System.out.println(s.capacity()); 
		s.append("Hello");  
		System.out.println(s.capacity()); 
		s.append("java is my favourite language");  
		System.out.println(s.capacity());
		System.out.println("_________________________________");

		
		//ensureCapacity() method of the StringBuffer class ensures that 
		//the given capacity is the minimum to the current capacity. 
		//If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2
		System.out.println(s.capacity());//default 16  
		s.append("Hello");  
		System.out.println(s.capacity());//now 16  
		s.append("java is my favourite language");  
		System.out.println(s.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		s.ensureCapacity(10);//now no change  
		System.out.println(s.capacity());//now 34  
		s.ensureCapacity(50);//now (34*2)+2  
		System.out.println(s.capacity());//now 70 
		System.out.println("_________________________________");
		
		
		
		

		
		
		
		








		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
