package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Palindrome {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isPalindrome()) {
												System.out.println("The number is a Palindrome number.");
									} else {
												System.out.println("The number is not a Palindrome number.");
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
			 * Check weather the no. is a Palindrome Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Palindrome Number, when the number
			 * remains unchanged on reversing its digits.
			 * @param n - The number to be checked
			 * @return boolean value i.e. the no. is palindrome or not
			 */
			public static boolean isPalindrome() {
						int Palindrome = 0, d;
						int n = num;
						while (n > 0) {
									d = n % 10;
									Palindrome = Palindrome * 10 + d;
									n /= 10;
						}
						if (Palindrome == num) {
									return true;
						} else {
									return false;
						}
			}
}
