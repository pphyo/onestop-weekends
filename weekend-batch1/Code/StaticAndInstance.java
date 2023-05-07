public class StaticAndInstance {

	public static void main(String[] args) {
		
		User.count = 10;
		User.count++;

		System.out.println("Count: " + User.count);

		// User.name = "Mg Mg"; error
		User usr1 = new User("Ko Kyaw");
		usr1.count++;
		usr1.age++;

		User usr2 = new User();
		usr2.count++;
		usr2.age++;

		System.out.println("Count: " + User.count);

		System.out.println("User Name: " + usr1.name);

		// System.out.println("User 1 Age: " + usr1.age);
		// System.out.println("User 2 Age: " + usr2.age);

		System.out.println("Total Age: " + (usr1.getAge() + usr2.getAge()));

	}
	
}

class User {

	static int count;
	String name;
	String password;
	int age = 1;

	static {
		System.out.println("Static block. 1");
	}

	static {
		System.out.println("Static block. 2");
	}

	{
		System.out.println("Instance Block 1");
	}

	{
		System.out.println("Instance Block 2");
	}

	public User() {
		System.out.println("Default Const");
	}

	public User(String outName) {
		name = outName;
		System.out.println("1 arg Const");
	}

	void setAge(int age) {
		if(age == 10)
			return;
	}

	public boolean isMature() {
		if(age > 15)
			return true;
		
		return false;
	}

	public int getAge() {
		System.out.println("getAge()");
		return age;
	}
}