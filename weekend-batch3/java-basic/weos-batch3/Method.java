class Method {

	// DRY => Don't repeat yourself

	public static void main(String[] args) {
		int mark = 10;
		if(mark >= 80 && mark <= 100) {
			System.out.println('A');
		} else if(mark >= 60 && mark < 80) {
			System.out.println('B');
		} else if(mark >= 40 && mark < 60) {
			System.out.println('C');
		} else if(mark >= 0 && mark < 40) {
			System.out.println('D');
		}
	}

	static int add(int numOne, int numTwo) {

		return numOne + numTwo;
	}
	
}