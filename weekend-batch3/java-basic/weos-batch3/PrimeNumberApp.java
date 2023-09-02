import java.util.Scanner;

public class PrimeNumberApp {

	private Scanner sc;

	public PrimeNumberApp() {
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		var app = new PrimeNumberApp();
		app.run();
	}

	void run() {
		// show message
		showMessage("Welcome To Prime Number Search Program!");

		do {
			breakLine();
			// get input for start number
			int start = getInt("Enter start number: ");

			// get input for end number
			int end = getInt("Enter end number: ");

			// find primes between start and end number
			int[] primes = findPrimesBetween(start, end);

			// show result
			// no prime, if prime, one prime, many prime
			if(primes.length == 0) {
				breakLine();
				System.out.println(
					"There is no prime number between %d and %d.".formatted(start, end)
				);

			} else {
				breakLine();

				String verb = primes.length == 1 ? "is" : "are";
				String numText = primes.length == 1 ? "number" : "numbers";

				System.out.print(
					"Prime %s between %d and %d %s ".formatted(numText, start, end, verb)
				);

				for(int i = 0; i < primes.length; i++) {

					if(i == primes.length - 1) {
						System.out.print(primes[i] + ".");
					} else {
						System.out.print(primes[i] + ", ");
					}

				}
			}

			breakLine();

		} while(getString("Do you want to continue(y/others)?: ").equalsIgnoreCase("y"));
		
		breakLine();
		showMessage("Thank you for using App.");
		// close scanner
		sc.close();

	}

	int[] findPrimesBetween(int start, int end) {
		int[] result = new int[0];
		for(int c = start; c <= end; c++) {
			if(isPrime(c)) {
				result = addPrime(c, result);
			}
		}
		return result;
	}

	int[] addPrime(int prime, int[] array) {
		// create temp array
		int[] temp = new int[array.length + 1];

		// copy data from original array
		for(int c = 0; c < array.length; c++) {
			temp[c] = array[c];
		}

		// add data to temp's last index
		temp[temp.length - 1] = prime;

		// change reference
		array = temp;

		return array;
	}

	boolean isPrime(int num) {

		if(num < 2)
			return false;

		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}

		return true;
	}

	void showMessage(String message) {
		String star = "";

		for(int i = 0; i < message.length(); i++) {
			star += "*";
		}

		System.out.println("**".concat(star).concat("**"));
		System.out.println("* ".concat(message).concat(" *"));
		System.out.println("**".concat(star).concat("**"));
	}

	void breakLine() {
		System.out.println();
	}
	
	public String getString(String message) {
		System.out.print(message);
		return sc.nextLine();
	}

	public int getInt(String message) {
		// String str = getString(message);
		// int result = Integer.parseInt(str);
		// return result;
		return Integer.parseInt(getString(message));
	}

}