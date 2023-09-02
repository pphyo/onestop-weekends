class BranchingStmt {

	public static void main(String[] args) {
		nestedLoop();
	}

	static void nestedLoop() {

		outer:
		for(int i = 0; i < 5; i++) {
			inner:
			for(int j = 0; j < 5; j++) {
				if(j == 3)
					break outer;
				System.out.println("%d : %d".formatted(i, j));
			}
		}

	}

	static void contStmt(int counter) {
		for(int i = 0; i < counter; i++) {
			if(i % 2 == 0)
				continue;

			System.out.println(i);
		}

		System.out.println("Program Terminated.");

	}

	static void returnStmt(int num) {
		System.out.println("Program Started...");

		if(num == 10) {
			return;
		}

		System.out.println("Your number is " + num);

		System.out.println("Program Terminated.");
	}

	static void breakStmt() {
		for(int i = 0; i < 10; i++) {
			if(i == 6) {
				return;
			}

			System.out.println(i);
		}

		System.out.println("Program Terminated...");
	}
	
}