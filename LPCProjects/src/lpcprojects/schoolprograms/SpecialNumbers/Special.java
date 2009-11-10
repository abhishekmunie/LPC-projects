package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Special {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isSpecial()) {
												System.out.println("The number is a Special number.");
									} else {
												System.out.println("The number is not a Special number.");
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
			 * Check weather the no. is a Special Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Special Number, when sum of Factorial of its digits is equal to the number.
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is special or not
			 */
			public static boolean isSpecial() {
						long sum = 0;
						int n = num;
						while (n >= 1) {
									 sum += getFactorial(n%10);
										n /= 10;
						}
						if (sum == num) {
									return true;
						} else {
									return false;
						}
			}

			/**
			 * Returns the factorial of the number.
			 * @param num
			 * @return int of getFactorial
			 * @throws IllegalNumberException
			 */
			public static long getFactorial(int num) {
						if (num == 0) {
									return 1;
						}
						long f = 1;
						for (int i = 1; i <= num; i++) {
									f *= i;
						}
						return f;
			}
}
