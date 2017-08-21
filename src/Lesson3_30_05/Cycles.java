package Lesson3_30_05;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.FontFamilyAction;

public class Cycles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = 100;
		// while (x >=10) {
		// System.out.println(x);
		// x--;
		// }

		// do {
		// System.out.println(x);
		// x--;
		// } while (x < 10);

		// for (int i = -100; i < x; i++) {
		// System.out.print(i + " ");
		// if (i % 10 == 0) {
		// System.out.println();
		// }
		// }

		// for(int i=0;i<=5;i++){
		// for(int j =0 ;j<10; j++){
		// System.out.println(i+""+j);
		// }
		// }
		// int sum = 0;
		// for (int i = 0; i <= 1000; i++) {
		// sum += i;
		// System.out.println(sum);
		// if (sum > 500) {
		// break;
		// }
		// }
		//
		// for (int i = 10; i <= 50; i++) {
		// if (i < 10) {
		//
		// } else {
		// System.out.println(i);
		// }
		// }
		int sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i > 200) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		System.out.println("Enter Seson number");
		int n = in.nextInt();
//		System.out.println("Enter second number:");
//		int m = in.nextInt();
//		for (int i = 1; i < 1000; i++) {
//			if (i > n && i < m) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		switch(n){
		
		case 12:
		case 1:
		case 2:System.out.println("its winter");break;
		case 3:
		case 4:
		case 5:System.out.println("its spring");break;
		case 6:
		case 7: 
		case 8:System.out.println("its summer");break;
		case 9:
		case 10:
		case 11:System.out.println("its easter");break;
		}
		
		in.close();
	}

}
