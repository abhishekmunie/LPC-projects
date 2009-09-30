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
public class MatrixTranspose {

    static int[][] A,  B,  At,  Bt,  sumAB,  sumAtBt,  diffAB,  diffAtBt;

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of rows:");
        int r = Integer.parseInt(BR.readLine());
        System.out.println("Enter the no. of columns:");
        int c = Integer.parseInt(BR.readLine());
        A = new int[r][c];
        B = new int[r][c];
        System.out.println("Enter Matrix A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                for (;;) {
                    try {
                        A[i][j] = Integer.parseInt(BR.readLine());
                    } catch (NumberFormatException e) {
                        continue;
                    }
                    break;
                }
            }
        }
        System.out.println("Enter Matrix B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                try {
                    B[i][j] = Integer.parseInt(BR.readLine());
                } catch (NumberFormatException e) {
                    continue;
                }
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("~~~~~Welcome~~~~~");
        System.out.println("This program we demonstrates Matrix Operations - Transpose.");
        System.out.println();
        input();
        System.out.println();
        System.out.println("Actual Matrix A");
        printMatrix(A);
        System.out.println();
        At = transpose(A);
        System.out.println("Transposed Matrix A");
        printMatrix(At);
        System.out.println();
        System.out.println("Actual Matrix B");
        printMatrix(B);
        System.out.println();
        Bt = transpose(B);
        System.out.println("Transposed Matrix B");
        printMatrix(Bt);
        System.out.println();
        sumAB = add(A, B);
        System.out.println("Sum of Actual Matrix A and B");
        printResult(A, B, sumAB, '+');
        System.out.println();
        sumAtBt = add(At, Bt);
        System.out.println("Sum of Transpose of Matrix A and B");
        printResult(At, Bt, sumAtBt, '+');
        System.out.println();
        diffAB = substract(A, B);
        System.out.println("Difference of Actual Matrix A and B");
        printResult(A, B, diffAB, '-');
        System.out.println();
        diffAtBt = substract(At, Bt);
        System.out.println("Difference of Transpose of Matrix A and B");
        printResult(At, Bt, diffAtBt, '-');
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] T = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[0].length; j++) {
                T[i][j] = matrix[j][i];
            }
        }
        return T;
    }

    public static void printSumOFRows(int[][] matrix) {
        System.out.println("Sum of Rows:-");
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
        }
    }

    public static void printSumOFColumns(int[][] matrix) {
        System.out.println("Sum of Columns:-");
        for (int i = 0; i < matrix[0].length; i++) {
            int rowColumn = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowColumn += matrix[j][i];
            }
            System.out.println("Column " + i + ": " + rowColumn);
        }
    }

    public static int[][] add(int[][] M1, int[][] M2) {
        int Sum[][] = new int[M1.length][M1[0].length];
        for (int i = 0; i < Sum.length; i++) {
            for (int j = 0; j < Sum[0].length; j++) {
                Sum[i][j] = M1[i][j] + M2[i][j];
            }
        }
        return Sum;
    }

    public static int[][] substract(int[][] M1, int[][] M2) {
        int Diff[][] = new int[M1.length][M1[0].length];
        for (int i = 0; i < Diff.length; i++) {
            for (int j = 0; j < Diff[i].length; j++) {
                Diff[i][j] = M1[i][j] - M2[i][j];
            }
        }
        return Diff;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        printSumOFRows(matrix);
        printSumOFColumns(matrix);
    }

    public static void printResult(int[][] A, int[][] B, int[][] Result, char oper) {
        for (int i = 0; i < Result.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            if (i == (Result.length / 2)) {
                System.out.print(oper + "\t");
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
