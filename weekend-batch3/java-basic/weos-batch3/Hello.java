class Hello {

	static String strData = "Hello Variables";
	static int intData;
	// intData = 20; error
	static boolean boolData;
	static double doubleData;
	static char charData;

	public static void main(String[] args) {

		int a, b, c;

		a = 20;
		b = 20;
		c = 10;

		System.out.println(strData);
		String strData = "Hello JDC";
		System.out.println(strData);

		System.out.println(Hello.intData);
		System.out.println(Hello.boolData);		
		System.out.println(Hello.doubleData);
		System.out.println(Hello.charData);


	}

}