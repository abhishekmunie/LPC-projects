/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.computer.String;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class ToggleCase {

    static String str;

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        input();
        System.out.println("The string after converting to Toggle Case is: " + toToggleCase(str));
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        str = BR.readLine();
    }

    static String toToggleCase(String s) {
        String strToggled = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ci = (int) ch;
            if ((ci >= 65) && (ci <= 90)) {
                ch = Character.toLowerCase(ch);
            }
            if ((ci >= 97) && (ci <= 122)) {
                ch = Character.toUpperCase(ch);
            }
            strToggled += ch;
        }
        return strToggled;
    }
}
