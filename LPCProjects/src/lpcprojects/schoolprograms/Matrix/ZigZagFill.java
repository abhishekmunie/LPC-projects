/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.Matrix;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class ZigZagFill {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int n;
	 static int[][] matrix;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			fill();
			display();
	 }

	 /**
	  * Accepts the value of from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("Enter the value of n: ");
			n = Integer.parseInt(bufferedReader.readLine());
			matrix = new int[n][n];
	 }

	 /**
		* Fill the element in matrix in zig-zag manner.
		*/
	 static void fill() {
			int count = 1;
			int i = 0;
			for (i = 0; i < n; i++) {
				 for (int j = 0; j <= i; j++) {
						matrix[i - j][j] = count++;
				 }
			}
			i--;
			for (int j = 0; j < n; j++) {
				 for (int k = i; k > j; k--) {
						matrix[k][n + j - k] = count++;
				 }
			}
	 }

	 /**
	  * Displays the matrix.
	  */
	 static void display() {
			for (int i = 0; i < matrix.length; i++) {
				 for (int j = 0; j < matrix[i].length; j++) {
						System.out.print(matrix[i][j] + "\t");
				 }
				 System.out.println();
			}
	 }
}
