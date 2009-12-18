package lpcprojects.schoolprograms.Pattern;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class NumberPattern2 {

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
			System.out.print("Enter the number until where the pattern has to be printed: ");
			num = Integer.parseInt(BR.readLine());
	 }

	 static void printSeries(int num) {
			int k = 1;
			for (int i = 0; true; i++) {
				 for (int j = 0; j <= i; j++) {
						System.out.print(k + "\t");
						if (k == num) {
							 return;
						}
						k++;
				 }
				 System.out.println();
			}
	 }
}
