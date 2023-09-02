import java.util.Scanner;

class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = sc.nextLine();

		System.out.print("Enter age: ");
		int age = Integer.valueOf(sc.nextLine());

		System.out.print("Enter job: ");
		String job = sc.nextLine();

		System.out.println(
			"I am %s. I am %d years old. I work at %s.".formatted(name, age, job)
		);

		sc.close();
	}
	
}