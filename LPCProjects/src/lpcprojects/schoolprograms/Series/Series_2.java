/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.Series;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Series_2 {

    static int n;
    static int result;
    static int a;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        input();
        computeSeries();
        display();
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of n: ");
        n = Integer.parseInt(BR.readLine());
    }

    static void computeSeries() {
        for (int i = 1; i <= n; i++) {
            result += ((i + 1) * (i + 2));
            System.out.println("r" + result);
        }
    }

    private static void display() {
        System.out.println("The result of series is: " + result);
    }
}
