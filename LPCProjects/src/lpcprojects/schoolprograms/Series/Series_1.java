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
public class Series_1 {

    static int n;
    static int result = 1;
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
        System.out.print("Enter the value of a: ");
        a = Integer.parseInt(BR.readLine());
        System.out.print("Enter the value of n: ");
        n = Integer.parseInt(BR.readLine());
    }

    static void computeSeries() {
        for (int i = 1; i < n; i++) {
            result += factorial((int) (Math.pow(a, i + 1) / i));
        }
    }

    static long factorial(int num) {
        long f = 1;
        if (num < 0) {
            System.out.println("The no. whose factorial has to be found is less than one");
            System.exit(0);
        }
        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    private static void display() {
        System.out.println("The result of series is: " + result);
    }
}