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
public class ToggleVowel {

    static String str;
    static String strT = "";

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        char c = "S".charAt(0);
        System.out.println(c + "~~>" + (c == 's'));
        input();
        vowelToggler();
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        str = BR.readLine();
    }

    static void vowelToggler() {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                c = Character.toUpperCase(c);
            }
            else if ((c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
                c = Character.toLowerCase(c);
            }
            strT += c;
        }
        System.out.println("The string after converting vowels to Toggle Case is: " + strT);
    }
}
