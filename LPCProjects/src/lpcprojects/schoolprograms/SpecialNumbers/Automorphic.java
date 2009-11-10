package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Automorphic {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isAutomorphic()) {
												System.out.println("The number is a Automorphic number.");
									} else {
												System.out.println("The number is not a Automorphic number.");
									}
									System.out.println();
									System.out.println("Do you want to continue?(yes/no)");
									if (BR.readLine().equalsIgnoreCase("no")) {
												break;
									}
									System.out.println();
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the number: ");
						num = Integer.parseInt(BR.readLine());
			}

			/**
			 * Check weather the no. is a Automorphic Number or not
			 * and returns the corresponding boolean value.<tr>
			 *
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is Automorphic or not
			 */
			public static boolean isAutomorphic() {
						int n = num;
						return (Math.pow(num, 2) % 10 == n);
			}
}

