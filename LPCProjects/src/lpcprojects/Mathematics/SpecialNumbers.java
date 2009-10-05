/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Contains meathods which can be use be use to check weather the number is one of these special number
 *
 * @author Abhishek
 */
public class SpecialNumbers {

    /**
     * Checks that ihe number passed to it is a Armstrong Number or not
     * and returns the corresponding boolean value.<tr>
     * A number is Armstrong Number if the sum of cubes of its digts is equal to the number.<tr>
     * 13
     * @param num - The number to be checked
     * @return
     */
    public static boolean isArmstrong(int num) {
        int n = num;
        int sum = 0;
        while (n >= 1) {
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }
        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check weather the no. is a Automorphic Number or not
     * and returns the corresponding boolean value.<tr>
     *
     * @param n - The number to be checked
     * @return boolean value i.e. the no. is automorphic or not
     */
    public static boolean isAutomorphic(int n) {
        return true;
    }

    public static boolean isComposite(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param num
     * @return
     */
    public static boolean isMagic(int num) {
        int n = num;
        int sum = 0;
        while (n >= 10) {
            sum = 0;
            while (n >= 1) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        if (sum == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks that ihe number passed to it is a Perfect Number or not
     * and returns the corresponding boolean value.<tr>
     *
     * @param num - The number to be checked
     * @return
     */
    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i <= (num / 2); i++) {
            if ((num % i) == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks that ihe number passed to it is a Prime Number or not
     * and returns the corresponding boolean value.<tr>
     * A number is prime if it has 1 and itself as its only getFactors.
     * @param n - The number to be checked
     * @return boolean value i.e. the no. is prime or not
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        double limit = Math.ceil(Math.sqrt(n)) + 1;
        boolean isPrime = true;
        int j = 3;
        while (j < limit) {
            if (n % j == 0) {
                isPrime = false;
                break;
            }
            j += 2;
        }
        return isPrime;
    }

    /**
     * Check weather the no. is a Palindrome Number or not
     * and returns the corresponding boolean value.<tr>
     * A number is Palindrome Number, when the number
     * remains unchanged on reversing its digits.
     * @param n - The number to be checked
     * @return boolean value i.e. the no. is palindrome or not
     */
    public static boolean isPalindrome(int n) {
        int Palindrome = 0, d;
        while (n > 0) {
            d = n % 10;
            Palindrome = Palindrome * 10 + d;
            n /= 10;
        }
        if (Palindrome == n) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check weather the String is a Palindrome or not
     * and returns the corresponding boolean value.<tr>
     * A String is a Palindrome, when the String remains
     * unchanged on reversing its character.
     * @param n - The String to be checked
     * @return boolean value i.e. the no. is palindrome or not
     */
    public static boolean isPalindrome(String nS) {
        return new StringBuffer(nS).reverse().toString().equals(nS);
    }

    /**
     * Smith number is a number who's sum of digits is equal
     * to the sun of digits of Prime Factors of the number.
     * e.g. 666.
     * @param n
     * @return
     */
    public static boolean isSmith(int n) {
        int[] PrimeFactors;
        try {
            PrimeFactors = MathematicalFunction.getPrimeFactors(n);
        } catch (IllegalNumberException ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
        int sum = 0;
        int sumOfDigits = 0;
        for (int i = 0; i < PrimeFactors.length; i++) {
            int pfn = PrimeFactors[i];
            while (pfn >= 1) {
                sum += (pfn % 10);
                pfn /= 10;
            }
        }
        int num = n;
        while (num >= 1) {
            sumOfDigits += (num % 10);
            num /= 10;
        }
        return (sum == sumOfDigits);
    }

    /**
     * Check weather the no. is a Special Number or not
     * and returns the corresponding boolean value.<tr>
     * A number is Special Number, when sum of getFactorial of its digits is equal to the number.
     * @param n - The number to be checked
     * @return boolean value i.e. the no. is special or not
     * @throws abhishekjava.Mathematics.MathematicalException
     */
    public static boolean isSpecial(int n) {
        int[] digitA = MathematicalFunction.getDigitArray(n);
        int sum = 0;
        for (int i = 0; i < digitA.length; i++) {
            try {
                sum += MathematicalFunction.getFactorial(digitA[i]);
            } catch (IllegalNumberException ex) {
                System.out.println("Error: " + ex.getMessage());
                return false;
            }
        }
        System.out.println(sum);
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("************************");
        System.out.println("*****Special Number*****");
        System.out.println("************************");
        for (;;) {
            System.out.println();
            System.out.println("Select the type of special number for which you want to test the number:");
            System.out.println(
                    "0 - All" +
                    "1 - Armstrong\n" +
                    "2 - Automorphic\n" +
                    "3 - Composite\n" +
                    "4 - Magic\n" +
                    "5 - Palindrome" +
                    "6 - Perfect\n" +
                    "7 - Prime\n" +
                    "8 - Special\n" +
                    "9 - Smith");
            System.out.println("Enter a number.");
            int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            switch (n) {
                case 0:
                    System.out.println("Armstrong Number: " + isArmstrong(n));
                    System.out.println("Automorphic Number: " + isAutomorphic(n));
                    System.out.println("Composite Number: " + isComposite(n));
                    System.out.println("Magic Number: " + isMagic(n));
                    System.out.println("Perfect Number: " + isPerfect(n));
                    System.out.println("Prime Number: " + isPrime(n));
                    System.out.println("Palindrome Number: " + isPalindrome(n));
                    System.out.println("Special Number: " + isSpecial(n));
                    System.out.println("Smith Number: " + isSmith(n));
                    break;
                case 1:
                    System.out.println("Armstrong Number: " + isArmstrong(n));
                    break;
                case 2:
                    System.out.println("Automorphic Number: " + isAutomorphic(n));
                    break;
                case 3:
                    System.out.println("Composite Number: " + isComposite(n));
                    break;
                case 4:
                    System.out.println("Magic Number: " + isMagic(n));
                    break;
                case 5:
                    System.out.println("Perfect Number: " + isPerfect(n));
                    break;
                case 6:
                    System.out.println("Prime Number: " + isPrime(n));
                    break;
                case 7:
                    System.out.println("Palindrome Number: " + isPalindrome(n));
                    break;
                case 8:
                    System.out.println("Special Number: " + isSpecial(n));
                    break;
                case 9:
                    System.out.println("Smith Number: " + isSmith(n));
                    break;
                default:
            }
        }
    }
}
