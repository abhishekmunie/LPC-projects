/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class CharacterSort {

    static String str;

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        input();
        System.out.print("The sorted string is: ");
        sort();
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        str = BR.readLine();
    }

    static void sort() {
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if ((c == (char) i) || (c == (char) (i + 32))) {
                    System.out.print(c);
                }
            }
        }
    }
}
