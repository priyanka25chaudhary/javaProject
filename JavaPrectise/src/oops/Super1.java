//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method.
//super() can be used to invoke immediate parent class constructor.

package oops;

class Animal1 {
	void eat() {
		System.out.println("eating");
	}
}

class cow extends Animal1 {
	void eat() {
		System.out.println("eating bread");
	}

	void chew() {
		System.out.println("chewing");
	}

	void work() {
		super.eat();
		work();
	}
}

class TestSuper2 {
	public static void main(String args[]) {
		cow d = new cow();
		d.work();
	}
}
