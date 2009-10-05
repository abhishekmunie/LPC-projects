package lpcprojects.Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HPDivision {

    static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        for (;;) {
            System.out.print("Enter the number: ");
            int num = Integer.parseInt(BR.readLine());
            System.out.print("Enter the divisor: ");
            int div = Integer.parseInt(BR.readLine());
            System.out.print("Enter the decimal place till where you want the answer: ");
            int deci = Integer.parseInt(BR.readLine());
            divide(num, div, deci);
            System.out.println();
            System.out.println("Do you want to continue?(yes/no)");
            if (BR.readLine().equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    public static void divide(long dividend, long divisor, long decimalPlace) {
        long a, b, c, d;
        boolean h = false;
        boolean r = false;
        long f = 1;
        System.out.println(dividend + " divided by " + divisor
                + " to " + decimalPlace + " decimal place is:");
        for (;;) {
            if (dividend < divisor) {
                if (!r) {
                    System.out.print("O.");
                } else {
                    System.out.print("0");
                    dividend = dividend * 10;
                    h = r = true;
                }
            } else {
                break;
            }
        }
        a = dividend / divisor;
        if (!h) {
            System.out.print(a + ".");
        } else {
            System.out.print(a);
        }
        b = dividend % divisor;
        while (f <= decimalPlace) {
            c = b * 10;
            for (;;) {
                if (c < divisor) {
                    c = c * 10;
                    System.out.print("0");
                } else {
                    break;
                }
            }
            d = c / divisor;
            System.out.print(d);
            b = c % divisor;
            f++;
        }
    }
}
