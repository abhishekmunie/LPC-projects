package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Armstrong {

    static int num;
    static int result = 0;
    static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        for (;;) {
            input();
            isArmstrong();
            System.out.println();
            System.out.println("Do you want to continue?(yes/no)");
            if (BR.readLine().equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    static void input() throws IOException {
        System.out.print("Enter the no. to be checked to be an Armstrong no.: ");
        num = Integer.parseInt(BR.readLine());
    }

    static void isArmstrong() {
        int n = num;
        while (n > 0) {
            result += Math.pow(n % 10, 3);
            n /= 10;
        }
        if (result == num) {
            System.out.println("The no. is an armstrong no.");
        } else {
            System.out.println("The no. is not an armstrong no.");
        }
    }
}
