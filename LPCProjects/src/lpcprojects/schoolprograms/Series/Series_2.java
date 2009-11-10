package lpcprojects.schoolprograms.Series;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Abhishek
 */
public class Series_2 {

			static int n;
			static int result;
			static int a;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									computeSeries();
									display();
									System.out.println();
									System.out.println("Do you want to continue? (yes/no)");
									if (BR.readLine().equalsIgnoreCase("no")) {
												break;
									}
									System.out.println();
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the value of n: ");
						n = Integer.parseInt(BR.readLine());
			}

			static void computeSeries() {
						result = 0;
						for (int i = 1; i <= n; i++) {
									result += ((i + 1) * (i + 2));
						}
			}

			private static void display() {
						System.out.println("The result of series is: " + result);
			}
}
