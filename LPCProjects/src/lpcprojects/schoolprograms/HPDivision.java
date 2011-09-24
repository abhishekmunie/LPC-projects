package lpcprojects.schoolprograms;

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
            System.out.print("Enter the decimal place until where you want the answer: ");
            int deci = Integer.parseInt(BR.readLine());
            System.out.println();
            System.out.println("Using Integer: ");
            divide(num, div, deci);
            System.out.println();
            System.out.println("Using BigInteger: ");
            System.out.println();
            for (;;) {
                System.out.println();
                System.out.println("Do you want to continue?(yes/no)");
                String c = BR.readLine();
                if (c.equalsIgnoreCase("yes")) {
                    break;
                } else if (c.equalsIgnoreCase("no")) {
                    System.exit(0);
                } else {
                    System.out.println("Invalid Entry.\n");
                    continue;
                }
                System.out.println();
            }
        }
    }
    
    public static void divide(long dividend, long divisor, long decimalPlace) {
        long a, b, c, d;
        boolean r = false;
        long f = 1;
        System.out.println(dividend + " divided by " + divisor + " to " + decimalPlace + " decimal place is:");
        while(dividend < divisor && f <= decimalPlace) {
            if (!r) {
                System.out.print("0.");
                r = true;
            } else {
                System.out.print("0");
                dividend = dividend * 10;
                f++;
            }
        }
        a = dividend / divisor;
        if (!r) {
            System.out.print(a + ".");
        } else {
            System.out.print(a);
            f++;
        }
        b = dividend % divisor;
        while (f <= decimalPlace) {
            c = b * 10;
            while ((c < divisor) && (f < decimalPlace)) {
                c = c * 10;
                System.out.print("0");
                f++;
            }
            d = c / divisor;
            System.out.print(d);
            b = c % divisor;
            f++;
        }
    }
}
