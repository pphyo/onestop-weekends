public class Inheritance {
	int data
	public static void main(String[] args) {
		
		Person us = new UniversalStudent("Ko Ko Maung");

		System.out.printf("Name: %s%n", us.getName());
		System.out.printf("Age: %d%n", us.getAge());
		us.work();
		us.eat();
		// us.study();
	}
	
}

class Person {
	private String name;
	private int age;

	public Person(String name) {
		super(); // this must be first line in constructor
		this.name = name;
		System.out.println("Person constructor");
	}

	protected void work() {
		System.out.println("Person is working...");
	}

	public void eat() {
		System.out.println("Person is eating...");
	}

	// getter or accessor
	public String getName() {
		return this.name;
	}

	// setter or mutator
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class UniversalStudent extends Person {

	public UniversalStudent(String name) {
		super(name);
		System.out.println("UniversalStudent constructor");
	}

	// must be same return type from parent's one
	// must be same name form parent's one
	// must be same parameter list from parent
	// must be wider than form parent
	@Override
	public void work() {
		System.out.println("UniversalStudent is working...");
	}

	public void study() {
		System.out.println("UniversalStudent is studying...");
	}
}

class Employee extends Person {
	public Employee() {
		super("");
	}
}