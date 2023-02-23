package oops;
class main {

public void display() {

System.out.println("main");

}

}

//inheritance

class Two extends main {

@Override

public void display() {

System.out.println("Two");

}

public int add(int x, int y) {

return x+y;

}

//Overload

public double add(double x,double y) {

return x+y;

}

}

//encapsulation example

class EncapTest {

private String name;

public String getName() {

return name;

}

public void setName(String newName) {

name = newName;

}

}

//abstraction

abstract class TwoWheeler {

public abstract void run();

}

class Honda extends TwoWheeler{

public void run(){

System.out.println("\nbike is Running..");

}

}

class MainClass {

public static void main(String[] args) {

main a=new main();

a.display();

Two b=new Two();

b.display();

System.out.println(b.add(4,2));

System.out.println(b.add(5.,2.)); //polymorphism

EncapTest encap = new EncapTest();

encap.setName("Sandeep's");

System.out.print("Name : " + encap.getName() );

TwoWheeler test = new Honda();

test.run();

}

}