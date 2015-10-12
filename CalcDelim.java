/*
 * Project: CalcDelim .java
 * Description: Reads in a String math formula, separates based on delim,
 * Author: Seunghoon Park
 * Date: 12 October, 2015
 */
import java.util.Scanner;
public class CalcDelim {
	String formula;
	public CalcDelim() {

	}
	public void getFormula() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a maths formula.");
		formula = scan.nextLine();
	}
	public String returnFormula() {
		return formula;
	}
	public double calculate(String str) {
		Scanner t = new Scanner(str);
		t.useDelimiter("\\s*\\+\\s*|\\s*\\-\\s*|\\s*\\*\\s*|\\s*\\/\\s*"); // separate out the operators
		double answer = 0;
		double value = 0;
		char operand;
		while(t.hasNext()) {
			System.out.println(t.next());
			System.out.println(t.delimiter());
		}
		return answer;
	}
	/*
	 * 1. ask the user for a String of input (math formula)
	 * 2. useDelimiter() to separate out the operators
	 * 3. calculate and display the solution
	 */
	public static void main(String args[]) {
		CalcDelim c = new CalcDelim();
		c.getFormula();
		c.calculate(c.returnFormula());
	}
}
