package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Abhishek
 */
public class Smith {

    static int num;
    static int sum;
    static int counter;
    static int[] PrimeFactors;
    static int sumOfDigits;

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        input();
        getPrimeFactors();
        display();
        if (isSmith()) {
            System.out.println("The no. is a smith number.");
        } else {
            System.out.println("The no. is not a smith number.");
        }
    }

    private static void getPrimeFactors() {
        int n = num;
        sum = 0;
        counter = 0;
        PrimeFactors = new int[num / 2];
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    PrimeFactors[counter] = i;
                    counter++;
                    sum += i;
                    n /= i;
                    break;
                }
            }
        }
    }

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
        return Arrays.copyOf(primeFactors, c);
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        num = Integer.parseInt(BR.readLine());
        PrimeFactors = new int[num / 2];
    }

    static void display() {
        System.out.println("The Prime Factors of the number are:");
        for (int i = 0; i < counter; i++) {
            System.out.print(PrimeFactors[i]);
            if (i < (counter - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("The sun of Prime Factors of the number is:");
        for (int i = 0; i < counter; i++) {
            System.out.print(PrimeFactors[i]);
            if (i < (counter - 1)) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }

    public static boolean isSmith() {
        return (sum==sumOfDigits);
    }
}
