/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.computer.SpecialNumbers;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Composite {

    static int num;

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        input();
        if (isComposite()) {
            System.out.println("The no. is a Composite number.");
        } else {
            System.out.println("The no. is not a Composite number.");
        }
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        num = Integer.parseInt(BR.readLine());
    }

    static boolean isComposite() {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
