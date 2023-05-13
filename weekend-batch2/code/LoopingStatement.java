class LoopingStatement {

	public static void main(String[] args) {
		doWhileLoop();
	}

	static void doWhileLoop() {

		boolean flag = false;
		int number = 0;
		do {
			
			if(number == 5)
				flag = false;

			System.out.println(number);
			number ++;

		} while(flag);

	}

	static void whileLoop() {

		boolean flag = true;

		int number = 0;

		while(flag) {

			if(number == 7)
				flag = false;

			System.out.println(number);
			number++;

		}

	}

	static void traditionalFor() {
		System.out.println("Start");

		for(int i = 1; i < 5; i++) {
			System.out.println(i);
		}

		int data = 10;

		for(; data > 0; data -= 3) {
			System.out.println(data);
		}

		System.out.println(data);

		System.out.println("End");

	}
	
}