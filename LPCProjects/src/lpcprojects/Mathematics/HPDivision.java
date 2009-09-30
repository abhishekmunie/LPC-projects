package lpcprojects.Mathematics;

public class HPDivision {

    public static void main(String[] args) {
        divide(1987, 37, 1000);
    }

    public static void divide(long dividend, long divisor, long deci) {
        long a, b, c, d, e;
        int h = 0;
        int r = 0;
        long f = 1;
        System.out.println(dividend + " divided by " + divisor + " to " + deci + " decimal place is:");
        for (;;) {
            if (dividend < divisor) {
                if (r == 0) {
                    System.out.print("O.");
                } else {
                    System.out.print("0");
                    dividend = dividend * 10;
                    h = 1;
                    r = 1;
                }
            } else {
                break;
            }
        }
        a = dividend / divisor;
        if (h == 0) {
            System.out.print(a + ".");
        } else {
            System.out.print(a);
        }
        b = dividend % divisor;
        while (f <= deci) {
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
