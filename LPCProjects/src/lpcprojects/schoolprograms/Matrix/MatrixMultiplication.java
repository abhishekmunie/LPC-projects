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
public class MatrixMultiplication {

			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
			static int[][] A, B, Result;

			public static void main(String[] args) throws IOException {
						Outer:
						for (;;) {
									input();
									multiplication();
									display();
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
						System.out.println("Enter the no. of rows:");
						int r = Integer.parseInt(BR.readLine());
						System.out.println("Enter the no. of columns:");
						int c = Integer.parseInt(BR.readLine());
						A = new int[r][c];
						B = new int[r][c];
						Result = new int[r][c];
						System.out.println("Enter the First Matrix:");
						for (int i = 0; i < r; i++) {
									for (int j = 0; j < c; j++) {
												A[i][j] = Integer.parseInt(BR.readLine());
									}
						}
						System.out.println("Enter the Second Matrix:");
						for (int i = 0; i < r; i++) {
									for (int j = 0; j < c; j++) {
												B[i][j] = Integer.parseInt(BR.readLine());
									}
						}
			}

			static void multiplication() throws IOException {
						for (int i = 0; i < Result.length; i++) {
									for (int j = 0; j < Result[i].length; j++) {
												Result[i][j] = A[i][j] + B[i][j];
									}
						}
			}

			static void display() {
						for (int i = 0; i < Result.length; i++) {
									for (int j = 0; j < A[i].length; j++) {
												System.out.print(A[i][j] + "\t");
									}
									if (i == (Result.length / 2)) {
												System.out.print("*\t");
									} else {
												System.out.print(" \t");
									}
									for (int j = 0; j < B[i].length; j++) {
												System.out.print(B[i][j] + "\t");
									}
									if (i == (Result.length / 2)) {
												System.out.print("=\t");
									} else {
												System.out.print(" \t");
									}
									for (int j = 0; j < Result[i].length; j++) {
												System.out.print(Result[i][j] + "\t");
									}
									System.out.println();
						}
			}
}
