class SwitchStmt {

	public static void main(String[] args) {
		
		int mark = 1000;

		char grade = checkMark(mark);
		String message = showMessage(grade);

		System.out.println(message);

	}

	static String showMessage(char grade) {

		return switch(grade) {
			case 'A' -> getText("Unbelievable", grade);
			case 'B' -> getText("Azmazing", grade);
			case 'C' -> getText("Good Job", grade);
			case 'D' -> getText("Sorry", grade);
			default -> "Wrong grade!";
		};
	}

	// static String showMessage(char grade) {

	// 	String result = null;

	// 	switch(grade) {
	// 		default:
	// 			result = "Wrong grade!";
	// 			break;
	// 		case 'A':
	// 			result = getText("Unbelievable", grade);
	// 			break;
	// 		case 'B':
	// 			result = getText("Amazing", grade);
	// 			break;
	// 		case 'C':
	// 			result = getText("Good Job", grade);
	// 			break;
	// 		case 'D':
	// 			result = getText("Sorry", grade);
	// 	}

	// 	return result;
	// }

	static String getText(String text, char c) {
		return "%s! You got %s.".formatted(text, c);
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
	
}