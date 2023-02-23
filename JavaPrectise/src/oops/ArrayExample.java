/*
 * Array:
 * Java array is an object which contains elements of a similar data type. 
 * The elements of an array are stored in a contiguous memory location
 * Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
   Random access: We can get any data located at an index position.
 */
//To illustrate  declare, instantiate, initialize  
//and traverse the Java array.
package oops;
class ArrayExample{  
public static void main(String args[]){  
int a[]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}}  