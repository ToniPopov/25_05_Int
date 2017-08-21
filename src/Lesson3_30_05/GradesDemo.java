package Lesson3_30_05;

import java.util.Scanner;

public class GradesDemo {

	public static void main(String[] args) {
		// System.out.println("Enter Grade");
		Scanner sc = new Scanner(System.in);
		int monthNumber = sc.nextInt();
		// switch(x){
		// case 2: System.out.println("Failed");break;
		// case 3: System.out.println("satisfying");break;
		// case 4: System.out.println("Good");break;
		// case 5: System.out.println("Very Good");break;
		// case 6: System.out.println("Excelent");break;
		// default: System.out.println("Ivalid grade input");break;
		// }
		// sc.close();

		switch (monthNumber) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days");
			break;
		case 2:
			System.out.println("28 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
			break;
			default: System.out.println("Out of range");break;
		}

	}
}
