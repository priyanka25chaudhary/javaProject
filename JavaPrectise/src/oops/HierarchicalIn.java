package oops;

class Pet{  
void eat(){System.out.println("eating");}  
}  
class Bird extends Pet{  
void fly(){System.out.println("flying");}  
}  
class Cat extends Pet{  
void meow(){System.out.println("meowing");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
  
}}  