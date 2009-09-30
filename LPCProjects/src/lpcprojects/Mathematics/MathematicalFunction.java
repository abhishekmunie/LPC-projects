/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.Mathematics;

import java.math.BigInteger;

/**
 * Contains some mathematical functions (i.e. factors, primerFactors, factorial
 *
 * @author Abhishek
 */
public class MathematicalFunction {

    /**
     * Return the individual digit of the number.
     * @param num
     * @return
     */
    public static int[] DigitArray(int num) {
        int[] digitIs = new int[Double.toString(num).length()];
        for (int i = 0; i < digitIs.length; i++) {
            digitIs[i] = num % 10;
            num /= 10;
        }
        return digitIs;
    }

    /**
     * Returns the factors of the number in form of an int Array.
     * @param num
     * @return int[] of factors
     */
    public static int[] factors(int num) {
        int leni = 0;
        int interlen = 0;
        int b = num / 2;
        for (int i = 1; i < b; i++) {
            if (num % i == 0) {
                leni++;
            }
        }
        int[] A = new int[leni + 1];
        A[0] = 1;
        for (int i = 1; i < b; i++) {
            if (num % i == 0) {
                A[interlen] = i;
                interlen++;
            }
        }
        A[interlen] = num;
        return A;
    }

    /**
     * Returns the prime factors of the number in form of an int Array.
     * @param num
     * @param code
     * @return int[] of prime factors
     * @throws MathematicalException
     */
    public static int[] getPrimeFactors(int n) {
        int c = 0;
        int[] primeFactors = new int[n / 2];
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    primeFactors[c] = i;
                    c++;
                    n /= i;
                    break;
                }
            }
        }
        return java.util.Arrays.copyOf(primeFactors, c);
    }

    /**
     * Returns the prime factors of the number in form of an int Array.
     * @param num
     * @param code
     * @return int[] of prime factors
     * @throws MathematicalException
     */
//    public static int[] primerFactors(int num) throws MathematicalException {
//        if (num <) {
//            int[] pF
//        }
//        =  new pF[1];
//
//        int j;
//        double limit;
//        int numprimes = 1; //2 is prime
//        int i = 3;
//        while (i <= num) {
//            boolean isPrime = true;
//            limit = Math.ceil(Math.sqrt(i)) + 1;
//
//            j = 3;
//            while (j < limit) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//                j += 2;
//            }
//            i += 2;
//            if (!isPrime) {
//                continue;
//            }
//            if (isPrime) {
//                numprimes++;
//            }
//        }
//
//        int[] A = null;
//        int b = num / 2;
//        A[0] = 1;
//        for (int i = 2; i < b; i++) {
//            if (SpecialNumbers.isPrime(i)) {
//                for (int j = 0; j < num; j++) {
//                    if ((num % i) == 0) {
//                        A[A.length] = i;
//                        num = num / i;
//                    } else {
//                        break;
//                    }
//                }
//            }
//
//        }
//        return A;
//    }

    /**
     * Returns the factorial of the number.
     * @param num
     * @param code
     * @return int of factorial
     * @throws abhishekjava.Mathematics.MathematicalException
     */
    public static long factorial(long num) throws IllegalNumberException {
        if (num < 0) {
            throw new IllegalNumberException("The no. whose factorial has to be found is less than one");
        }
        if (num == 0) {
            return 1;
        }
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f.longValue();
    }
}
