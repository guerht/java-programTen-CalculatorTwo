/*
 * Project: PlayingWithLoops.java
 * Description: Reviewing Loops
 * Author: Seunghoon Park
 * Date: 21 September, 2015
 */
import java.util.Scanner;
public class PlayingWithLoops {
	public static void main(String args[]) {
		// #1 for loops
		System.out.println("Nested for loop example: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// #2 while loops
		Scanner scan = new Scanner(System.in);
		int total = 0, count = 0, number;
		double average;
		System.out.println("Enter your grades to average them (-1 quits)");
		number = scan.nextInt(); // first time only
		while (number != -1) {
			total += number;
			count ++;
			System.out.println("Enter your grades to average them (-1 quits)");
			number = scan.nextInt();
		}
		if (count != 0) {
			average = (double) total / count;
			System.out.println("Your GPA is: " + average);
		}
		else {
			System.out.println("Nothing was entered");
		}
		// #3 assignment
		/* 
		 * 1. prompt the user for 2 ints
		 * 2. display all odd numbers between the ints
		 * (Assume 2nd num is greater)
		 * (HINT: Round even ints to odd, then use for loop) 
		 */
		int asdf;
		int qwer;
		System.out.print("Enter first integer: ");
		asdf = scan.nextInt();
		asdf++;
		System.out.print("\nEnter second integer (must be greater than the first): ");
		qwer = scan.nextInt();
		qwer--;
		if (asdf % 2 == 0) {
			asdf += 1;
		}
		for (int i = asdf; i <= qwer; i+=2) {
			System.out.println((i));
		}
	}
}