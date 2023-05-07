import entity.Other;

class Encapsulation extends Other {

	public static void main(String[] args) {
		Student stu = new Student("Mg Mg", 14);
		stu.setAge(-1);

		System.out.println(Other.pubInt);
		System.out.println(Other.proInt);
		// System.out.println(Other.defInt);
	}
	
}

class Student {
	private String name;
	private int age = 1;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) { // setter or mutator
		if(age > 0)
			this.age = age;
	}

	public int getAge() { // getter or accessor
		return age;
	}

	public String toString() {
		return "%s : %d".formatted(name, age);
	}

}