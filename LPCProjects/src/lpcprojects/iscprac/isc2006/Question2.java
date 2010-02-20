package lpcprojects.iscprac.isc2006;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question2 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static String[] A;
	 static String[] B;
	 static String[] C;
	 static int N;
	 static int M;

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
	  * Accepts the number of names in Array A & B, and then their element from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("Enten number of names in Array A, N = ");
			N = Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enten number of names in Array B, M = ");
			M = Integer.parseInt(bufferedReader.readLine());
			System.out.println("First array: (A)");
			A = new String[N];
			B = new String[M];
			for (int i = 0; i < N; i++) {
				 A[i] = bufferedReader.readLine();
			}
			System.out.println("Second array: (B)");
			for (int i = 0; i < M; i++) {
				 B[i] = bufferedReader.readLine();
			}
	 }

	 static String[] BubbleSort(String[] sort) {
			String temp;
			for (int i = 0; i < sort.length; i++) {
				 for (int j = 0; j < sort.length - 1 - i; j++) {
						if (sort[j].compareTo(sort[j + 1]) > 0) {
							 temp = sort[j];
							 sort[j] = sort[j + 1];
							 sort[j + 1] = temp;
						}
				 }
			}
			return sort;
	 }

	 /**
	  * Displays the sorted arrays.
	  */
	 static void display() {
			System.out.println();
			mergeTheArray();
			System.out.println("Sorted Array: (C)");
			printArray(BubbleSort(C));
			System.out.println("Sorted First Array: (A)");
			printArray(BubbleSort(A));
			System.out.println("Sorted Second Array: (B)");
			printArray(BubbleSort(B));

	 }

	 static void mergeTheArray() {
			C = new String[A.length + B.length];
			for (int i = 0; i < A.length; i++) {
				 C[i] = A[i];
			}
			for (int i = A.length; i < C.length; i++) {
				 C[i] = B[i - A.length];
			}
	 }

	 /**
	  * Displays the name in array.
	  */
	 static void printArray(String[] array) {
			for (int i = 0; i < array.length; i++) {
				 System.out.println(array[i]);
			}
	 }
}
