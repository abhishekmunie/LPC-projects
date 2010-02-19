/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.iscprac.isc2008;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question3 {

	 /**
	  * Size of matrix.
	  */
	 static int N;
	 /**
	  * Row position of Largest element of Matrix.
	  */
	 static int largestR;
	 /**
	  * Column position of Largest element of Matrix.
	  */
	 static int largestC;
	 /**
	  * Row position of Second Largest element of Matrix.
	  */
	 static int secondLargestR;
	 /**
	  * Column position of Second Largest element of Matrix.
	  */
	 static int secondLargestC;
	 /**
	  * Double dimensional array to store matrix.
	  */
	 static int[][] matrix;
	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	 /**
		* Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			System.out.println();
			display();
			System.out.println();
			printlargest();
			sort();
			System.out.println("\nSorted List ");
			display();
	 }

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

	 static void printlargest() {
			for (int i = 0; i < N; i++) {
				 for (int j = 0; j < N; j++) {
						if (matrix[i][j] > matrix[largestR][largestC]) {
							 largestR = i;
							 largestC = j;
						} else if (matrix[i][j] > matrix[secondLargestR][secondLargestC]) {
							 secondLargestR = i;
							 secondLargestC = j;
						}
				 }
			}
			System.out.println("The largest element " + matrix[largestR][largestC] + " is in row " + (largestR + 1) + " and column " + (largestC + 1));
			System.out.println("The second largest element " + matrix[secondLargestR][secondLargestC] + " is in row " + (secondLargestR + 1) + " and column " + (secondLargestC + 1));
	 }

	 static void sort() {
			for (int i = 0; i < N; i++) {
				 SelectionSort(matrix[i]);
			}
	 }

	 static int[] SelectionSort(int[] toBeSorted) {
			int minP, temp;
			for (int i = 0; i < toBeSorted.length; i++) {
				 minP = i;
				 for (int j = i + 1; j < toBeSorted.length; j++) {
						if (toBeSorted[j] < toBeSorted[minP]) {
							 minP = j;
						}
				 }
				 temp = toBeSorted[i];
				 toBeSorted[i] = toBeSorted[minP];
				 toBeSorted[minP] = temp;
			}
			return toBeSorted;
	 }

	 /**
	  * Displays the whole matrix in matrix form.
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
