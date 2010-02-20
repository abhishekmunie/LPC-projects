package lpcprojects.iscprac.isc2007;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question2 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int N;
	 static int[][] matrix;

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
	  * Accepts the value of N and elements of matrix from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("N = ");
			N = Integer.parseInt(bufferedReader.readLine());
			matrix = new int[N][N];
			for (int i = 0; i < N; i++) {
				 for (int j = 0; j < N; j++) {
						matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
				 }
			}
	 }

	 static boolean isWondrousSquare() {
			int wN = (int) (0.5 * N * ((N * N) + 1));
			int sumR;
			int sumC;
			for (int i = 0; i < matrix.length; i++) {
				 sumR = 0;
				 for (int j = 0; j < matrix.length; j++) {
						sumR += matrix[i][j];
				 }
				 if (sumR != wN) {
						return false;
				 }
				 sumC = 0;
				 for (int j = 0; j < matrix.length; j++) {
						sumC += matrix[j][i];
				 }
				 if (sumC != wN) {
						return false;
				 }
			}
			fori:
			for (int i = 1; i <= Math.pow(N, 2); i++) {
				 for (int j = 0; j < N; j++) {
						for (int k = 0; k < N; k++) {
							 if (matrix[j][k] == i) {
									continue fori;
							 }
						}
				 }
				 return false;
			}
			return true;
	 }

	 /**
	  * Checks that ihe number passed to it is a Prime Number or not
	  * and returns the corresponding boolean value.<tr>
	  * A number is prime if it has 1 and itself as its only factors.
	  * @param num
	  * @return boolean value i.e. the no. is prime or not
	  */
	 public static boolean isPrime(int num) {
			if (num <= 1) {
				 return false;
			}
			if (num == 2) {
				 return true;
			}
			double limit = Math.ceil(Math.sqrt(num)) + 1;
			int j = 2;
			while (j < limit) {
				 if (num % j == 0) {
						return false;
				 }
				 j++;
			}
			return true;
	 }

	 /**
	  * Displays the result.
	  */
	 static void display() {
			if (isWondrousSquare()) {
				 System.out.println("Yes it represents a wondrous square.");
			} else {
				 System.out.println("Not a wondrous square.");
			}
			System.out.println("Prime\tRow index\tcolumn index");
			fori:
			for (int i = 1; i <= Math.pow(N, 2); i++) {
				 if (isPrime(i)) {
						for (int j = 0; j < N; j++) {
							 for (int k = 0; k < N; k++) {
									if (matrix[j][k] == i) {
										 System.out.println("  " + i + "\t\t" + j + "\t\t" + k);
										 continue fori;
									}
							 }
						}
				 }
			}
	 }
}
