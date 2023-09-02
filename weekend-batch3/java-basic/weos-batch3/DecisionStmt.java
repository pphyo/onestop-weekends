import java.util.Scanner;

class DecisionStmt {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.print("Enter mark: ");

		int mark = sc.nextInt();
		char result = checkMark(mark);

		String text = result == 'Z' ? "You mark is out of range." : "You grade is %s.".formatted(result);

		System.out.println(text);

		System.out.println("Even number?: " + isEven(mark));
	}

	static char checkMark(int mark) {
		if(mark >= 80 && mark <= 100) {
			return 'A';
		} else if(mark >= 60 && mark < 80) {
			return 'B';
		} else if(mark >= 40 && mark < 60) {
			return 'C';
		} else if(mark >= 0 && mark < 40) {
			return 'D';
		}
		
		return 'Z';

	}
	
	static boolean isEven(int num) {
		return num % 2 == 0;
	}
}