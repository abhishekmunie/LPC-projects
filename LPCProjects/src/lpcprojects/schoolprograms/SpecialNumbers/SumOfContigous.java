package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class SumOfContigous {

    static int num;
    static int s;
    static int j;

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        input();
        compute(num);
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
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
