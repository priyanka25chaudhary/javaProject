package multiThreading;
public class StartMethod extends Thread{  
 public void run(){  
   System.out.println("running");  
 }  
 public static void main(String args[]){  
	 StartMethod t1=new StartMethod();  
  t1.start();  
  t1.start();  
 }  
}  