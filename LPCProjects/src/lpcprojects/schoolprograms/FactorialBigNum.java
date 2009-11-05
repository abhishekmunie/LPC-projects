/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms;

import java.io.*;
import java.math.BigInteger;

/**
 *
 * @author Abhishek
 */
public class FactorialBigNum {

    static int num;
    static BigInteger f = BigInteger.ONE;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        input();
        computeFactorial();
        display();
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no. whose factorial has to be found: ");
        num = Integer.parseInt(BR.readLine());
    }

    static void computeFactorial() {
        if (num < 0) {
            System.out.println("The no. whose factorial has to be found is less than one");
            System.exit(0);
        }
        if (num == 0) {
            return;
        }
        for (int i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
    }

    static void display() {
        System.out.println("The factorial of " + num + " is: " + f);
    }
}
