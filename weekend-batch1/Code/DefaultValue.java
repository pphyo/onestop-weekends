class DefaultValue {

	static int iValue = 0;
	static double dValue = 0.0d;
	static char cValue = '\u0000';
	static boolean boolValue = false;

	public static void main(String[] args) {
		// int localInt;

		// System.out.println(iValue);
		// System.out.println(localInt);

		System.out.println("Result: " + (getInt() + getDouble()));
	}

	void start(int number) {

		int data = 10;

	}

	// static long add(double num1, double num2) {
	// 	return num1 + num2;
	// } // error

	static int getInt() {
		System.out.println("getInt()");
		return 10;
	}

	static double getDouble() {
		System.out.println("getDouble()");
		return 10;
	}

}