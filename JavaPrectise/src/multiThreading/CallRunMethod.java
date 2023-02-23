package multiThreading;
class CallRunMethod extends Thread{  
 public void run(){  
   System.out.println("running");  
 }  
 public static void main(String args[]){  
	 CallRunMethod t1=new CallRunMethod();  
  t1.run();  
 }  
}  