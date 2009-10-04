package lpcprojects.computer;

public class NumberSystem {

    /**
     * Method D_B
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static long DecimalToBinary(long n) {
        long r = 0;
        while(n>1)
            r = ((n % 2) + (r * 10));
            n /= 2;
        }
        return r;
    }

    /**
     * Method D_O
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static int DecimalToOctagonal(double n) {
        // TODO: Add your code here
        String rs = "";
        for (;;) {
            rs = (CalculationsString.Remainder(a, "8", 'r')) + rs;
            a = CalculationsString.Remainder(a, "8", 'q');
            if ((a.equals("0")) || (a.equals("1")) || (a.equals("3")) || (a.equals("4")) || (a.equals("5")) || (a.equals("6")) || (a.equals("7"))) {
                break;
            }
        }
        return rs;
    }

    /**
     * Method D_H
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String DecimalToHexadecimal(double n) {
        // TODO: Add your code here
        String rs = "";
        String rsa = CalculationsString.Remainder(a, "16", 'r');
        String rsar;

        if (rsa.equals("10")) {
            rsar = "A";
        } else if (rsa.equals("11")) {
            rsar = "B";
        } else if (rsa.equals("12")) {
            rsar = "C";
        } else if (rsa.equals("13")) {
            rsar = "D";
        } else if (rsa.equals("14")) {
            rsar = "E";
        } else if (rsa.equals("15")) {
            rsar = "F";
        } else {
            rsar = rsa;
        }
        for (;;) {
            rs = rsar + rs;
            a = CalculationsString.Remainder(a, "16", 'q');
            if ((a.equals("0")) || (a.equals("1")) || (a.equals("3")) || (a.equals("4")) || (a.equals("5")) || (a.equals("6")) || (a.equals("7")) || (a.equals("8")) || (a.equals("9")) || (a.equals("A")) || (a.equals("B")) || (a.equals("C")) || (a.equals("D")) || (a.equals("E")) || (a.equals("F"))) {
                break;
            }
        }
        return rs;
    }

    /**
     * Method B_D
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static double BinaryToDecimal(double n) {
        long sum = 0;
        int d;
        while(n != 0){
            d = (int) (n % 10);

        }
        for (int i = 0; i < c.length; i++) {
            sum += Long.parseLong(CalculationsString.Multiplication(Character.toString(c[i]), (CalculationsString.Power("2", Integer.toString(i)))));
        }
        rs = Long.toString(sum);
        return rs;
    }

    /**
     * Method B_O
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String BinaryToOctagonal(double n) {
        // TODO: Add your code here
        String rs = "";

        return rs;
    }

    /**
     * Method B_H
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String BinaryToHexadecimal(double n) {
        // TODO: Add your code here
        String rs = "";

        return rs;
    }

    /**
     * Method O_D
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String OctagonalToDecimal(double n) {
        // TODO: Add your code here
        String rs = "";

        return rs;
    }

    /**
     * Method O_B
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String OctagonalToBinary(double n) {
        // TODO: Add your code here
        String rs = "";

        return rs;
    }

    /**
     * Method O_H
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String OctagonalToHexadecimal(double n) {
        // TODO: Add your code here
        String rs = "";

        return rs;
    }

    /**
     * Method H_D
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String HexadecimalToDecimal(double n) {
        // TODO: Add your code here
        String rs = "";

        return rs;
    }

    /**
     * Method H_B
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String HexadecimalToBinary(double n) {
        // TODO: Add your code here
        String rs = "";

        return rs;
    }

    /**
     * Method H_O
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static String HexadecimalToOctagonal(double n) {
        // TODO: Add your code here
        String rs = "";

        return rs;
    }

    /**
     * Method D_N
     *
     *
     * @param a
     *
     * @return
     *
     */
    public static final String D_N(String a) {
        // TODO: Add your code here
        long l = Long.parseLong(a);
        String rs = "";
        for (;;) {
            rs = Long.toString(1 + (l % 9)) + rs;
            l = l / 9;
            if (l <= 9) {
                break;
            }
        }
        return rs;
    }

    public static final String N_D(String a) {

        // TODO: Add your code here
        String rs = "";
        char c[] = a.toCharArray();
        long sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Long.parseLong(CalculationsString.Multiplication(Long.toString(((long) c[i]) - 1), (CalculationsString.Power("9", Integer.toString(i)))));
        }
        rs = Long.toString(sum);
        return rs;
    }
}
