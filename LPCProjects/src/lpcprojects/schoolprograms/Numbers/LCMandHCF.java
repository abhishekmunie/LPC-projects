package lpcprojects.schoolprograms.Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class LCMandHCF {

    static int num1;
    static int num2;

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        input();
        System.out.println("HCF: " + HCF(num1, num2));
        System.out.println("LCM: " + LCM(num1, num2));
    }

    static void input() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        num1 = Integer.parseInt(BR.readLine());
        num2 = Integer.parseInt(BR.readLine());
    }

    public static int HCF(int n1, int n2) {
        int hcf = 1;
        while ((n1 > 1) && (n2 > 1)) {
            for (int i = 2; ((i <= n1) || (i <= n2)); i++) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    n1 /= i;
                    n2 /= i;
                    hcf *= i;
                    System.out.print(i + ", ");
                    break;
                }
            }
        }
        System.out.println();
        return hcf;
    }

    public static int LCM(int n1, int n2) {
        int lcm = 1;
        while ((n1 > 1) || (n2 > 1)) {
            for (int i = 2; ((i <= n1) || (i <= n2)); i++) {
                if ((n1 % i == 0) || (n2 % i == 0)) {
                    if (n1 % i == 0) {
                        n1 /= i;
                        System.out.println("n1 " + n1);
                        break;
                    }
                    if (n2 % i == 0) {
                        n2 /= i;
                        System.out.println("n2 " + n2);
                        break;
                    }
                    lcm *= i;
                }
            }
        }
        return lcm;
    }
}
