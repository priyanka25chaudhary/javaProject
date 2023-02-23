/*We can compare String in Java on the basis of content and reference.
 * 
 * It is used in, authentication (by equals() method), 
 * sorting (by compareTo() method), 
 * reference matching (by == operator) etc.
 */


package StringPrograms;

class StringComparison { 
	 public static void main(String args[]){  
	   String s1="Sachin";  
	   String s2="Sachin";  
	   String s3=new String("Sachin");  
	   String s4="Saurav";  
	   System.out.println(s1.equals(s2));//true  
	   System.out.println(s1.equals(s3));//true  
	   System.out.println(s1.equals(s4));//false 
	   System.out.println("______________________________________");
	   
	   System.out.println(s1==s2);//true (because both refer to same instance)  
	   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 
	   System.out.println("______________________________________");

	   
	   //The String class compareTo() method compares values lexicographically and 
	   //returns an integer value that describes if first string is less than, 
	   //equal to or greater than second string.


	   System.out.println(s1.compareTo(s2));//0  
	   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
	   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  


	   
	   	 }  
	}  