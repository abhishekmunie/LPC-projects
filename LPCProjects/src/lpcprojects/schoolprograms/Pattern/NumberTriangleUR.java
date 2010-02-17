package lpcprojects.schoolprograms.Pattern;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class NumberTriangleUR {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int n;
	 static int length;
	 static int sum;

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			printPattern();
	 }

	 static void input() throws IOException {
			System.out.print("Enter a number: ");
			String str = bufferedReader.readLine();
			length = str.length();
			n = Integer.parseInt(str);
	 }

	 static void printDigit(int n) {
			if (n >= 10) {
				 printDigit(n / 10);
			}
			System.out.print(n % 10);
			sum += n % 10;
	 }

	 static void printPattern() {
			for (int i = 0; i < length; i++) {
				 for (int j = 0; j < i; j++) {
						System.out.print(" ");
				 }
				 printDigit((int) (n % (Math.pow(10, length - i))));
				 System.out.println();
			}
			System.out.println("The sum of numbers of pattern is: " + sum);
	 }
}