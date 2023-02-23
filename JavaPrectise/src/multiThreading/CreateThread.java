package multiThreading;
/*There are two ways to create a thread:
 * By extending Thread class
 * By implementing Runnable interface.
 * 
 */

//Thread Example by extending Thread class
class CreateThread extends Thread{  
public void run(){  
System.out.println("thread is running");  
}  
public static void main(String args[]){  
CreateThread t1=new CreateThread();  
t1.start();  
 }  
}  

