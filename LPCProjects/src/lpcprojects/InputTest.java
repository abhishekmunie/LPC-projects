/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lpcprojects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class InputTest {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter: ");
        int i1 = Integer.parseInt(b.readLine());
        char c = b.readLine().charAt(0);
        int i2 = Integer.parseInt(b.readLine());
    }

}
