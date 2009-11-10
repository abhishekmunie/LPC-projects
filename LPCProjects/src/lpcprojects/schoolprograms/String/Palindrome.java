package lpcprojects.schoolprograms.String;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Palindrome {

			static String str, reverseStr;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (reverseStr.equals(str)) {
												System.out.println("The String is a Palindrome.");
									} else if(reverseStr.equalsIgnoreCase(str)) {
												System.out.println("The String is a Palindrome, if the case of the characters is ignored.");
									} else {
												System.out.println("The String is not a Palindrome.");

									}
									for (;;) {
												System.out.println();
												System.out.println("Do you want to continue? (yes/no)");
												String c = BR.readLine();
												System.out.println();
												if (c.equalsIgnoreCase("yes")) {
															break;
												} else if (c.equalsIgnoreCase("no")) {
															System.exit(0);
												} else {
															System.out.println("Invalid Entry.\n");
															continue;
												}
									}
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the string: ");
						str = BR.readLine();
						reverseStr = new StringBuffer(str).reverse().toString();
			}
}
