//Java Program to demonstrate the way of passing an array  
//to method.
package oops;

public class Array {  
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {25, 100, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element: " + max);  
    }  
}  