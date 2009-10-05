package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class SumOfContigous {

    static int num;
    static int s;
    static int j;
    static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        for (;;) {
            input();
            compute(num);
            System.out.println();
            System.out.println("Do you want to continue?(yes/no)");
            if (BR.readLine().equalsIgnoreCase("no")) {
                break;
            }
            System.out.println();
        }
    }

    static void input() throws IOException {
        System.out.print("Enter the number: ");
        num = Integer.parseInt(BR.readLine());
    }

    public static void compute(int n) {
        for (int i = 0; i < n; i++) {
            s = 0;
            for (j = i; j < n; j++) {
                s += j;
                if (s == n) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(k);
                        if (k < j) {
                            System.out.print(" + ");
                        } else {
                            System.out.println(" = " + n);
                        }
                    }
                }
            }
        }
    }
}
