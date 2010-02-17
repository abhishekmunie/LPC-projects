package lpcprojects.schoolprograms.preboard;

import java.io.*;

/**
 * The class demonstrates the operation involving border of a matrix.
 * @author Abhishek Munie
 * @see lpcprojects.Mathematics.Matrix
 */
public class BorderOperation {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 /**
		* Number of rows.
		*/
	 static int r;
	 /**
		* Number of columns.
		*/
	 static int c;
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
			System.out.println("Original Matrix: ");
			display();
			sortBorder();
			System.out.println("Sorted Matrix: ");
			display();
			printBorderElement();
	 }

	 /**
	  * Accepts size and elements of matrix from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("Enter the number of rows: ");
			r = Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enter the number of columns: ");
			c = Integer.parseInt(bufferedReader.readLine());
			Matrix = new int[r][c];
			System.out.println("Enter the Square Matrix:");
			for (int i = 0; i < r; i++) {
				 for (int j = 0; j < c; j++) {
						Matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
				 }
			}
	 }

	 /**
	  * Returns the length of the border of matrix.
	  * @return The length of the border of matrix.
	  */
	 static int getBorderLenght() {
			return ((r * 2) + (c * 2) - 4);
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
			if (pos < c) {
				 return Matrix[0][pos];
			} else if ((pos -= (c - 1)) < r) {
				 return Matrix[pos][c - 1];
			} else if ((pos -= (r - 1)) < c - 1) {
				 return Matrix[r - 1][c - 1 - pos];
			} else if ((pos -= (c - 1)) <= (r - 1)) {
				 return Matrix[r - 1 - (pos)][0];
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
			if (pos <= (c - 1)) {
				 Matrix[0][pos] = num;
			} else if ((pos -= (c - 1)) <= (r - 1)) {
				 Matrix[pos][c - 1] = num;
			} else if ((pos -= (r - 1)) <= (c - 1)) {
				 Matrix[r - 1][c - 1 - pos] = num;
			} else if ((pos -= (c - 1)) <= (r - 1)) {
				 Matrix[r - 1 - (pos)][0] = num;
			}
	 }

	 /**
	  * Prints the border elements of matrix.
	  */
	 static void printBorderElement() {
			System.out.println("Border Elements: ");
			for (int i = 0; i < r; i++) {
				 for (int j = 0; j < c; j++) {
						if (isBorderElement(i, j)) {
							 sumOuter += Matrix[i][j];
							 System.out.print(Matrix[i][j] + "\t");
						} else {
							 System.out.print(" \t");
						}
				 }
				 System.out.println();
			}
			System.out.println("Sum of outer row amd column elements = " + sumOuter);
			System.out.println();
	 }

	 /**
	  * Checks if the element is a border element or not.
	  * @param i row no. of element
	  * @param j column no. of element
	  * @return
	  */
	 static boolean isBorderElement(int i, int j) {
			return ((i == 0) || (i == (r - 1)) || (j == 0) || (j == (c - 1)));
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
