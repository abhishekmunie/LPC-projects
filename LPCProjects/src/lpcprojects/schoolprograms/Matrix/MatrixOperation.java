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
public class MatrixOperation {

	static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	private static int[][] A;

	public static void main(String[] args) throws IOException {
		Outer:
		for (;;) {
			input();
			menu();
			for (;;) {
				System.out.println("Do you want to continue?");
				String ans = BR.readLine();
				if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")) {
					continue Outer;
				} else if (ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no")) {
					break Outer;
				} else {
					System.out.println("Wrong choice");
					continue;
				}
			}
		}
	}

	static void input() throws IOException {
		System.out.println("Enter the size Square Matrix:");
		int n = Integer.parseInt(BR.readLine());
		A = new int[n][n];
		System.out.println("Enter the Square Matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = Integer.parseInt(BR.readLine());
			}
		}
	}

	static void menu() throws IOException {
		outer:
		for (;;) {
			System.out.println("You can perform the following two Matrix Operations:");
			System.out.println("\t1: Print left diagonal");
			System.out.println("\t2: Sum up left diagonal");
			System.out.println("\t3: Print right diagonal");
			System.out.println("\t4: Sum up right diagonal");
			System.out.println("Enter your choice?");
			switch (Integer.parseInt(BR.readLine())) {
				case 1:
					System.out.println("Left Diagonal:");
					printLeftDiagonal();
					break outer;
				case 2:
					System.out.print("Sum of Left Diagonal:");
					sumLeftDiagonal();
					break outer;
				case 3:
					System.out.println("Right Diagonal:");
					printRightDiagonal();
					break outer;
				case 4:
					System.out.print("Sum of Right Diagonal:");
					sumRightDiagonal();
					break outer;
				default:
					System.out.println("Wrong Choice.");
					continue outer;
			}
		}
	}

	static void printLeftDiagonal() {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("\t");
			}
			System.out.println(A[i][i]);
		}
	}

	static void printRightDiagonal() {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length - 1 - i; j++) {
				System.out.print("\t");
			}
			System.out.println(A[i][A.length - 1 - i]);
		}
	}

	static void sumLeftDiagonal() {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i][i];
		}
		System.out.println(sum);
	}

	static void sumRightDiagonal() {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i][A.length - 1 - i];
		}
		System.out.println(sum);
	}
}
