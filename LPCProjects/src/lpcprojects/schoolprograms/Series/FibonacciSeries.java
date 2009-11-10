package lpcprojects.schoolprograms.Series;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class FibonacciSeries {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									computSeries(num);
									System.out.println();
									System.out.println("Do you want to continue? (yes/no)");
									if (BR.readLine().equalsIgnoreCase("no")) {
												break;
									}
									System.out.println();
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the number of term until where the series has to be calculated: ");
						num = Integer.parseInt(BR.readLine());
			}

			static void computSeries(int num) {
						int n;
						int n1 = 0;
						int n2 = 1;
						if (num >= 1) {
									System.out.print(n1);
						}
						if (num >= 2) {
									System.out.print(", " + n2);
						}
						for (int i = 3; i <= num; i++) {
									n = n1 + n2;
									System.out.print(", " + n);
									n1 = n2;
									n2 = n;
						}
						System.out.println();
			}
}
