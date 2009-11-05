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
public class Exchange13Sort2 {

    static int[][] A = new int[3][3];
    static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        for (;;) {
            input();
            System.out.println("Actual Matrix:");
            display();
            exchange13();
            sort2();
            System.out.println("Final Matrix:");
            display();
            System.out.println("Do you want to continue");
            if (BR.readLine().equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }
    }

    static void input() throws IOException {
        System.out.println("Enter a Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
    }

    static void exchange13() {
        int temp;
        for (int i = 0; i < 3; i++) {
            temp = A[0][i];
            A[0][i] = A[2][i];
            A[2][i] = temp;
        }
    }

    static void sort2() {
        int temp, min, minp;
        for (int i = 0; i < 3; i++) {
            min = A[1][i];
            minp = i;
            for (int j = i; j < 3; j++) {
                if (A[1][j] < min) {
                    min = A[1][j];
                    minp = j;
                }
            }
            temp = A[1][i];
            A[1][i] = A[1][minp];
            A[1][minp] = temp;
        }
    }

    static void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
