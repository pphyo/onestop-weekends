class ControlFlow {

	public static void main(String[] args) {
		run();
	}

	static void run() {
		System.out.println("run() starts.");

		int value = modernSwitch(1);
		System.out.println(value);

		System.out.println("run() ends.");
	}

	static void ifStmt(int num) {
		System.out.println("Start");

		if(num > 10 || num < 100) {
			System.out.println("Number is greater than 10.");
		} else if(num == 10) {
			System.out.println("Number is equal to 10.");
		}

		// if(num < 10) {
		// 	System.out.println("Number is less than 10");
		// }
		
		System.out.println("End");
	}

	boolean isEven(int num) {
		if(num % 2 == 0){
			return true;
		}
		
		return false;
	}

	int add(int num1, int num2) {
		return num1 + num2;
	}

	static int modernSwitch(int code) {

		return switch(code) {
			case 1:
				yield 10 + code;
			case 2:
				yield 20 + code;
			default:
				throw new IllegalArgumentException();
		};
	}

	static void legacySwitchStmt(int code) {
		System.out.println("Start");

		int result = 0;

		if(code > 0)
			switch(code) {
				case 1:
				case 2:
					result = 20 + code;
					System.out.println("Result: " + result);
					break;
				case 3:
					result = 30 + code;
					System.out.println("Result: " + result);
					break;
				default:
					System.out.println("Wrong Code!");
					break;
			}

		System.out.println("Start");

	}

	

}
