//Method overriding is used to provide the specific implementation of a method 
//which is already provided by its superclass.
//Method overriding is used for runtime polymorphism

/*
 * The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
 */
package oops;

//Creating a parent class  
class MethodOverriding1{  
  void run(){System.out.println("Vehicle is running");}  
}  
//Creating a child class  
class Bike extends MethodOverriding1{  
  public static void main(String args[]){  
  //creating an instance of child class  
  Bike obj = new Bike();  
  //calling the method with child class instance  
  obj.run();  
  }  
}  

