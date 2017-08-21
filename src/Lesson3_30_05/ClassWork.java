package Lesson3_30_05;

public class ClassWork {

	public static void main(String[] args) {
		// byte x = 5;
		// byte y = 6;
		// byte z = (byte)(x + y);
		// int x = 4;
		// if (x > 4) {
		// System.out.println("is greather than four");
		// }

		int x = 8;
		if (x == 1) {
			System.out.println("Monday");
		} else if (x == 2) {
			System.out.println("Thuesday");
		} else if (x == 3) {
			System.out.println("Wednesday");
		} else if (x == 4) {
			System.out.println("Thursday");
		} else if (x == 5) {
			System.out.println("Friday");
		} else if (x == 6) {
			System.out.println("Saturday");
		} else if (x == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Fuck you JORO");
		}

		switch (x) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Thuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 7: {
			System.out.println("Sunday");
			break;
		}
		default: {
			System.out.println("Fuck you JORO");
			break;
		}
		}

	}

}
