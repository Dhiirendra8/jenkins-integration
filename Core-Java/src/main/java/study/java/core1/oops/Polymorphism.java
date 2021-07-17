package study.java.core1.oops;

public class Polymorphism {
	public static void main(String arg[]) {
		Person p = new Employee(); // upcasting
		p.walk(); //Running Fast…
	}
}



class Person {
	void walk() {
		System.out.println("Can Run….");
	}
}

class Employee extends Person {
	void walk() {
		System.out.println("Running Fast…");
	}

	
}