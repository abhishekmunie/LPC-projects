/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.computer.Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Max_Min {

    static int[] num;
    static int max,  min;

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        input();
        compute_max_min();
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        num = new int[10];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(BR.readLine());
        }
    }

    static void compute_max_min() {
        max = min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
        }
    }
}
