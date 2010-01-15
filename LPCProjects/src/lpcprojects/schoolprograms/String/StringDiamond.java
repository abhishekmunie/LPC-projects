/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.String;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class StringDiamond {

	 static String str;
	 static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			for (;;) {
				 input();
				 printDiamond();
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
	 }

	 static void printDiamond() {
			for (int i = 0; i < str.length(); i++) {
				 for (int j = 0; j < str.length(); j++) {

				 }
			}
	 }
}
