class StaticAndInstance {

	public static void main(String[] args) {
		Student.counter++;
		Student.countDay();

		Student stu1 = new Student();
		stu1.name = "Abe";
		stu1.age = 18;
		stu1.counter = 20;
		System.out.println(stu1.name + ": " + stu1.age);
		stu1.countDay();

		Student stu2 = new Student();
		stu2.name = "Asta";
		stu2.age = 17;
		stu2.counter = 10;
		System.out.println(stu2.name + ": " + stu2.age);
		stu2.countDay();
	}
	
}

class Student {

	static int counter;
	String name;
	int age;
	String school;

	Student() {
		System.out.println("Default Constructor");
	}

	void study() {
		System.out.println("Student is studying...");
	}

	static void countDay() {
		System.out.println("Counter is " + counter);
	}

}