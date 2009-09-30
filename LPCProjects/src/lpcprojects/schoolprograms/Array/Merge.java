/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Merge {

    static int[] A, B, Merged;
    static int num;

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        input();
        mergeTheArray();
        display();
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of 1st Array : ");
        A = new int[Integer.parseInt(BR.readLine())];
        System.out.println("Enter the elements of 1st Array : ");
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(BR.readLine());
        }
        System.out.print("Enter the size of 2nd Array : ");
        B = new int[Integer.parseInt(BR.readLine())];
        System.out.println("Enter the elements of 2nd Array : ");
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(BR.readLine());
        }
    }

    static void mergeTheArray(){
        Merged = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            Merged[i] = A[i];
        }
        for (int i = A.length; i < Merged.length; i++) {
            Merged[i] = B[i - A.length];
        }
    }

    static void display() {
        for (int i = 0; i < Merged.length; i++) {
            System.out.print(Merged[i]);
            if(i < (Merged.length - 1)){
                System.out.print(", ");
            }
        }
    }
}
