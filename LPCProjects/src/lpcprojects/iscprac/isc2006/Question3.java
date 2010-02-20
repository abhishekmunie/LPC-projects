package lpcprojects.iscprac.isc2006;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question3 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int N;
	 static String code;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			display();
	 }

	 /**
	  * Accepts  from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("N = ");
			N = Integer.parseInt(bufferedReader.readLine());
			if (N > 6) {
				 System.out.println("Error! Length of string should not exceed 6 characters!");
				 System.exit(0);
			}
			code = bufferedReader.readLine();
	 }

	 /**
	  * Displays .
	  */
	 static void display() {
			if (code.length() != N) {
				 System.out.println("Invalid! String length not the same as specified!");
				 System.exit(0);
			}
			for (int i = 0; i < code.length(); i++) {
				 if (!Character.isUpperCase(code.charAt(i))) {
						System.out.println("Invalid! Only upper case letters permitted!");
						System.exit(0);
				 }
				 if (!isAcceptableCode(code.charAt(i))) {
						System.out.println("Invalid! Only alternate letters permitted!");
						System.exit(0);
				 }
				 if(code.indexOf(code.charAt(i)) != code.lastIndexOf(code.charAt(i))){
						System.out.println("Invalid! Repetition of characters not permitted!");
						System.exit(0);
				 }
			}
			System.out.println("Valid!");
	 }

	 static boolean isAcceptableCode(char c) {
			switch (c) {
				 case 'A':
				 case 'C':
				 case 'E':
				 case 'G':
				 case 'I':
				 case 'K':
						return true;
			}
			return false;
	 }
}
