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
public class ActualMatrixMultiplication {

			static int[][] A, B, Product;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			public static void main(String[] args) throws IOException {
						Outer:
						for (;;) {
									input();
									multiply();
									display();
									for (;;) {
												System.out.println("Do you whant to continue?");
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
						System.out.println("Enter the no. of rows in First Matrix");
						int a = Integer.parseInt(BR.readLine());
						System.out.println("Enter the no. of columns in First Matrix");
						int b = Integer.parseInt(BR.readLine());
						System.out.println("As by rule of Matrix Multiplycation, no. of rows in Second Matrix = no. of columns in First Matrix");
						System.out.println("Therefore there is no need to enter no. of rows in Second Matrix");
						System.out.println("Enter the no. of columns in Second Matrix");
						int c = Integer.parseInt(BR.readLine());
						A = new int[a][b];
						B = new int[b][c];
						Product = new int[a][c];
						System.out.println("Enter the First Matrix:");
						for (int i = 0; i < A.length; i++) {
									for (int j = 0; j < A[i].length; j++) {
												A[i][j] = Integer.parseInt(BR.readLine());
									}
						}
						System.out.println("Enter the Second Matrix:");
						for (int i = 0; i < B.length; i++) {
									for (int j = 0; j < B[i].length; j++) {
												B[i][j] = Integer.parseInt(BR.readLine());
									}
						}
			}

			static void multiply() {
						for (int i = 0; i < Product.length; i++) {
									for (int j = 0; j < Product[i].length; j++) {
												int pro = 0;
												for (int k = 0; k < A[i].length; k++) {
															pro += A[i][k] * B[k][j];
												}
												Product[i][j] = pro;
									}
						}
			}

			static void display() {
						int g;
						if (A.length > B.length) {
									g = A.length;
						} else {
									g = B.length;
						}
						for (int i = 0; i < g; i++) {
									if (i < A.length) {
												for (int j = 0; j < A[i].length; j++) {
															System.out.print(A[i][j] + "\t");
												}
									} else {
												for (int j = 0; j < A[i].length; j++) {
															System.out.print(" \t");
												}
									}
									if (i == g / 2) {
												System.out.print("*\t");
									} else {
												System.out.print(" \t");
									}
									if (i < B.length) {
												for (int j = 0; j < B[i].length; j++) {
															System.out.print(B[i][j] + "\t");
												}
									} else {
												for (int j = 0; j < B[i].length; j++) {
															System.out.print(" \t");
												}
									}
									if (i == g / 2) {
												System.out.print("=\t");
									} else {
												System.out.print(" \t");
									}
									if (i < Product.length) {
												for (int j = 0; j < Product[i].length; j++) {
															System.out.print(Product[i][j] + "\t");
												}
									}
									System.out.println();
						}
			}
}
