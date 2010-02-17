package lpcprojects.schoolprograms.Matrix;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class BorderOperation {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int r;
	 static int c;
	 static int[][] Matrix;

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			display();
//			System.out.println("B Len: " + getBorderLenght());
//			for (int i = 0; i < getBorderLenght(); i++) {
//				 System.out.println("getBorderElement(" + i + ") : " + getBorderElement(i));
//			}
			printBorderElement();
			printInnerElement();
			sortBorder();
			display();
	 }

	 static void input() throws IOException {
//			System.out.print("Enter the number of rows: ");
//			r = Integer.parseInt(bufferedReader.readLine());
//			System.out.print("Enter the number of columns: ");
//			c = Integer.parseInt(bufferedReader.readLine());
//			Matrix = new int[r][c];
//			System.out.println("Enter the Square Matrix:");
//			for (int i = 0; i < r; i++) {
//				 for (int j = 0; j < c; j++) {
//						Matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
//				 }
//			}
			r = 4;
			c = 3;
			Matrix = new int[][]{
								 {1, 7, 4},
								 {8, 2, 3},
								 {5, 7, 0},
								 {7, 9, 6}
							};
	 }

	 static int getBorderLenght() {
			return ((r * 2) + (c * 2) - 4);
	 }

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

	 static void printBorderElement() {
			System.out.println("Border Elements: ");
			for (int i = 0; i < r; i++) {
				 for (int j = 0; j < c; j++) {
						if (isBorderElement(i, j)) {
							 System.out.print(Matrix[i][j] + "\t");
						} else {
							 System.out.print(" \t");
						}
				 }
				 System.out.println();
			}
			System.out.println();
	 }

	 static void printInnerElement() {
			System.out.println("Inner Elements: ");
			for (int i = 0; i < r; i++) {
				 for (int j = 0; j < c; j++) {
						if (!isBorderElement(i, j)) {
							 System.out.print(Matrix[i][j] + "\t");
						} else {
							 System.out.print(" \t");
						}
				 }
				 System.out.println();
			}
			System.out.println();
	 }

	 static boolean isBorderElement(int i, int j) {
			return ((i == 0) || (i == (r - 1)) || (j == 0) || (j == (c - 1)));
	 }

	 static void display() {
			System.out.println("Matrix: ");
			for (int i = 0; i < Matrix.length; i++) {
				 for (int j = 0; j < Matrix[i].length; j++) {
						System.out.print(Matrix[i][j] + "\t");
				 }
				 System.out.println();
			}
	 }
}
