class LoopingStmt {

	public static void main(String[] args) {
		
		whileLoop();
	}

	static void forStmt() {
		int result = 0;
		for(int i = 1; i <= 10; i++) {
			result += i;
		}
		System.out.println(result);
	}
	
	static void doWhile() {

		int i = 100;

		do {

			System.out.println(i);

			i++;

		} while(i < 10);

	}

	static void whileLoop() {

		int i = 100;

		while(i < 10) {
			System.out.println(i);
			i++;
		}

	}
}