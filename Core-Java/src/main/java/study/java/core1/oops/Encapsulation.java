package study.java.core1.oops;

public class Encapsulation {
	private String name; //Here, the variable “name” is kept private or “encapsulated.”

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Encapsulation s = new Encapsulation();
		s.setName("Dhirendra");
		System.out.println(s.getName());

	}
}
