package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Unique {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isUnique()) {
												System.out.println("The number is a Unique number.");
									} else {
												System.out.println("The number is not a Unique number.");
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
			 * Check weather the no. is a Unique Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Unique Number, if any digit is not repeated in it.
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is unique or not
			 */
			public static boolean isUnique() {
						int digCount = 0;
						for (int i = 0; i <= 9; i++) {
									digCount = 0;
									int n = num;
									while (n >= 1) {
												if (i == (n % 10)) {
															digCount++;
															if (digCount > 1) {
																		return false;
															}
												}
												n /= 10;
									}
						}
						return true;
			}
}
