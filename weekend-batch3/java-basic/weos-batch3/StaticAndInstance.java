// [owner].[member]

// owner => Class and Object

// member => static and instance(non-static)

class StaticAndInstance {
	public static void main(String[] args) {

		// Object creation
		Student stu = new Student();
		stu.name = "Maw Ku Hto";
		stu.age = 40;
		stu.gender = "Male";
		stu.rollNo++;

		Student stu2 = new Student();
		stu2.name = "Leng Meng";
		stu2.age = 43;
		stu2.gender = "Female";
		stu2.rollNo++;

		System.out.println(stu.toString());
		System.out.println(stu2.toString());

		System.out.println("Name: " + stu.name);
		System.out.println("Age: " + stu.age);
		System.out.println("Gender: " + stu.gender);
		System.out.println("Roll no: " + stu.rollNo);

		System.out.println("==============");

		System.out.println("Name: " + stu2.name);
		System.out.println("Age: " + stu2.age);
		System.out.println("Gender: " + stu2.gender);
		System.out.println("Roll no: " + stu2.rollNo);

		stu.study();

	}
}

class Student {
	// Constructor or special method
	Student() {}
	String name;
	int age;
	String gender;
	static int rollNo;

	void study() {
		rollNo = 3;
		System.out.println(rollNo);
	}

}