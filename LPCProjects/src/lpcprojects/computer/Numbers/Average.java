/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.computer.Numbers;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Average {

    static int n1,  n2,  n3;

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        input();
        compute();
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the 1st number: ");
        n1 = Integer.parseInt(BR.readLine());
        System.out.print("Enter the 2nd number: ");
        n2 = Integer.parseInt(BR.readLine());
        System.out.print("Enter the 3rd number: ");
        n3 = Integer.parseInt(BR.readLine());
    }

    static void compute() {
        int sum = n1 + n2 + n3;
        float avg = sum / 3;
        System.out.println("Average = " + avg);
    }
}
