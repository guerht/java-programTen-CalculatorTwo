/*
 * Project: AdvancedCalculatorTwo.java
 * Description: An exploration into "while" loops with a calculator.
 * Author: Seunghoon Park
 * Date: 16 September, 2015
 */
import java.util.Scanner;
public class AdvancedCalculatorTwo {
	public static void main(String args[]) {
		// 1. for loop
		int sum = 0, j;
		for (j = 3; j<=79; j++) {
			sum = sum + j;
		}
		System.out.println("sum = " + sum);
		// 2. for -> while loop
		int sum2 = 0, j2;
		j2 = 3;
		while (j2 <= 79) {
			sum2 = sum2 + j2;
			j2++;
		}
		System.out.println("sum2 = " + sum2);
		// #5
		boolean done = false;
		int i = 10;
		while (!done) {
			if (i < 1) {
				done = true;
				System.out.println("done.");
				break; // halts loop immediately
			}
			i--;
			System.out.println("i = " + i);
		}
		// #12-2
		int k = 0, boxer = 11;
		while (k < 10) {
			k++;
			if (k != 5) {
				continue; // skips back to the start of the loop
			}
			boxer = boxer + k; // run this code when k == 5
		}
		System.out.println("boxer = " + boxer);
		// #13
		double m = 92.801;
		int l = 0;
		do {
			l += 2;
			if (l > 3) {
				continue; //skip the m += 3
			}
			m += 3;
		} while (l < 6);
		System.out.println("m = " + m);
		/*
		 * Advanced Calculator II
		 * Copy-paste the old calculator code in,
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Make your arithmetic choice below:");
		System.out.println("A. Addition\tS. Subtraction\tM. Multiplication\tD. Division");
		// char = '' single quotes and NO double quotes
		// String = "" double quotes and NO single quotes
		// ch != choice, as you can't put String into char
		String choice;
		char ch;
		double d1, d2;
		choice = scan.nextLine();
		ch = choice.charAt(0);
		/*if (ch != 'a' || ch != 'A' || ch != 's' || ch != 'S' || ch != 'm' || ch != 'M' || ch != 'd' || ch != 'D') {
			System.out.println("ERROR EXCEPTION: char is not defined as choice.\n\nTROUBLESHOOT:\n\nPlease check whether you entered one of the options.");
		}*/
		/*else {*/
			System.out.println("Enter the first number: ");
			d1 = scan.nextDouble();
			System.out.println("Enter the second number: ");
			d2 = scan.nextDouble();
			// switch to choose which operand to use.
			switch(ch) {
				case 'A':
				case 'a':
					System.out.println(d1 + "+" + d2 + "=" + (d1+d2));
					break;
				case 'S':
				case 's':
					System.out.println(d1 + "-" + d2 + "=" + (d1-d2));
					break;
				case 'M':
				case 'm':
					System.out.println(d1 + "*" + d2 + "=" + (d1*d2));
					break;
				case 'D':
				case 'd':
					System.out.println(d1 + "/" + d2 + "=" + (d1/d2));
					break;
				default:
					System.out.println("ERROR EXCEPTION: char is not defined as choice.\n\nTROUBLESHOOT:\n\nPlease check whether you entered a, s, m, or d.");
		/*}*/
		}
	}
}