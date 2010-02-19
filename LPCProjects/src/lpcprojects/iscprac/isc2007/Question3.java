package lpcprojects.iscprac.isc2007;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question3 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int m;
	 static int n;
	 static int frequency;

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
	  * Accepts the value of m and n from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("m = ");
			m = Integer.parseInt(bufferedReader.readLine());
			System.out.print("n = ");
			n = Integer.parseInt(bufferedReader.readLine());
	 }

	 /**
	  * Check weather the no. is a Unique Number or not
	  * and returns the corresponding boolean value.<tr>
	  * A number is Unique Number, if any digit is not repeated in it.
	  * @param num number to be checked.
	  * @return boolean value i.e. the no. is unique or not
	  */
	 public static boolean isUnique(int num) {
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

	 /**
	  * Displays the unique numbers in range m to n and their frequency.
	  */
	 static void display() {
			System.out.println("THE UNIQUE-DIGIT INTEGERS ARE:-");
			String unique = "";
			for (int i = m; i <= n; i++) {
				 if (isUnique(i)) {
						unique += i + " ";
						frequency++;
				 }
			}
			unique = unique.trim().replace(" ", ", ");
			System.out.println(unique + ".");
			System.out.println("FREQUENCY-UNIQUE DIGIT INTEGERS IS: " + frequency);
	 }
}
