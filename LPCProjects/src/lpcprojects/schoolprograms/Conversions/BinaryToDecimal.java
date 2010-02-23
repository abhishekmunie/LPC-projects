/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.Conversions;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class BinaryToDecimal {

    static int num;
    static int result = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        input();
        convertBinaryToDecimal();
        display();
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no. to be converted from binary to decimal: ");
        num = Integer.parseInt(BR.readLine());
    }

    static void convertBinaryToDecimal() {
        int p, q, d, m = 0, n = num;
        while (n != 0) {
            q = n / 10;
            p = q * 10;
            d = n - p;
            if (d > 1 || d < 0) {
                System.out.println("The no. you entered is not a binary no.");
            }
            result = (int) (result + d * Math.pow(2, m));
            n = q;
            m++;
        }
    }

    static void display() {
        System.out.println("The decimal equeivalent of binary no. " + num + ", is: " + result);
//				System.out.println("Correct: " + Integer.);
    }
}
