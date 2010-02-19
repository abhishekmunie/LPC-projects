package lpcprojects.iscprac.isc2009;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question2 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 /**
		* Number of rows.
		*/
	 static int M;
	 /**
		* Number of columns.
		*/
	 static int N;
	 /**
		* Sum of outer border elements.
		*/
	 static int sumOuter;
	 /**
		* Double dimensional array to store matrix.
		*/
	 static int[][] Matrix;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			System.out.println("ORIGINAL MATRIX: ");
			display();
			sortBorder();
			System.out.println("REARRANGED MATRIX: ");
			display();
			printBorderElement();
	 }

	 /**
	  * Accepts size and elements of matrix from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("Enter the number of rows: ");
			M = Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enter the number of columns: ");
			N = Integer.parseInt(bufferedReader.readLine());
			Matrix = new int[M][N];
			System.out.println("Enter the Square Matrix:");
			for (int i = 0; i < M; i++) {
				 for (int j = 0; j < N; j++) {
						Matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
				 }
			}
	 }

	 /**
	  * Returns the length of the border of matrix.
	  * @return The length of the border of matrix.
	  */
	 static int getBorderLenght() {
			return ((M * 2) + (N * 2) - 4);
	 }

	 /**
	  * Sorts the border elements of the matrix.
	  */
	 static void sortBorder() {
			int minP, temp;
			for (int i = 0; i < getBorderLenght(); i++) {
				 minP = i;
				 for (int j = i + 1; j < getBorderLenght(); j++) {
						if (getBorderElement(j) < getBorderElement(minP)) {
							 minP = j;
						}
				 }
				 temp = getBorderElement(i);
				 setBorderElement(getBorderElement(minP), i);
				 setBorderElement(temp, minP);
			}
	 }

	 /**
	  * Returns the Border Element at position pos while considering
	  * the border to be starting at top left corner and filled clockwise.
	  * @param pos position of Border Element.
	  * @return Border Element at position pos.
	  */
	 static int getBorderElement(int pos) {
			if (pos < N) {
				 return Matrix[0][pos];
			} else if ((pos -= (N - 1)) < M) {
				 return Matrix[pos][N - 1];
			} else if ((pos -= (M - 1)) < N - 1) {
				 return Matrix[M - 1][N - 1 - pos];
			} else if ((pos -= (N - 1)) <= (M - 1)) {
				 return Matrix[M - 1 - (pos)][0];
			} else {
				 return -1;
			}
	 }

	 /**
	  * Sets the value of Border Element at position pos while considering
	  * the border to be starting at top left corner and filled clockwise.
	  * @param num value to be set.
	  * @param pos position of Border Element.
	  */
	 static void setBorderElement(int num, int pos) {
			if (pos <= (N - 1)) {
				 Matrix[0][pos] = num;
			} else if ((pos -= (N - 1)) <= (M - 1)) {
				 Matrix[pos][N - 1] = num;
			} else if ((pos -= (M - 1)) <= (N - 1)) {
				 Matrix[M - 1][N - 1 - pos] = num;
			} else if ((pos -= (N - 1)) <= (M - 1)) {
				 Matrix[M - 1 - (pos)][0] = num;
			}
	 }

	 /**
	  * Prints the border elements of matrix.
	  */
	 static void printBorderElement() {
			System.out.println("BOUNDARY ELEMENTS: ");
			for (int i = 0; i < M; i++) {
				 for (int j = 0; j < N; j++) {
						if (isBorderElement(i, j)) {
							 sumOuter += Matrix[i][j];
							 System.out.print(Matrix[i][j] + "\t");
						} else {
							 System.out.print(" \t");
						}
				 }
				 System.out.println();
			}
			System.out.println("SUM OF THE OUTER ROW AND COLUNM ELEMENTS = " + sumOuter);
			System.out.println();
	 }

	 /**
	  * Checks if the element is a border element or not.
	  * @param i row no. of element
	  * @param j column no. of element
	  * @return
	  */
	 static boolean isBorderElement(int i, int j) {
			return ((i == 0) || (i == (M - 1)) || (j == 0) || (j == (N - 1)));
	 }

	 /**
	  * Displays the whole matrix in matrix form.
	  */
	 static void display() {
			for (int i = 0; i < Matrix.length; i++) {
				 for (int j = 0; j < Matrix[i].length; j++) {
						System.out.print(Matrix[i][j] + "\t");
				 }
				 System.out.println();
			}
	 }
}
