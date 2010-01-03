package lpcprojects.schoolprograms.Pattern;

import java.io.*;

/**
 * Prints a patern in following way:
 *     1
 *    2 2
 *   3 3 3
 *  4 4 4 4
 * 5 5 5 5 5
 * @author Abhishek
 */
public class NumberPattern1 {

	 static int num;
	 static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			for (;;) {
				 input();
				 printSeries(num);
				 System.out.println();
				 System.out.println("Do you want to continue? (yes/no)");
				 if (BR.readLine().equalsIgnoreCase("no")) {
						break;
				 }
				 System.out.println();
			}
	 }

	 static void input() throws IOException {
			System.out.print("Enter the number of rows until where the pattern has to be printed: ");
			num = Integer.parseInt(BR.readLine());
	 }

	 static void printSeries(int num) {
			for (int i = 1; i <= num; i++) {
				 for (int j = 0; j < num - i; j++) {
						System.out.print(" ");
				 }
				 for (int j = 0; j < i; j++) {
						System.out.print(i + " ");
				 }
						System.out.println();
			}
	 }
}
