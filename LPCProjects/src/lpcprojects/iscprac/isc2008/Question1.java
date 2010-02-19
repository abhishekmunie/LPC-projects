/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.iscprac.isc2008;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question1 {

	 static int num;
	 static int sum;
	 static int counter;
	 static int[] PrimeFactors;
	 static int sumOfDigits;
	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			getPrimeFactors();
			display();
	 }

	 static void input() throws IOException {
			System.out.print("Enter the number: ");
			num = Integer.parseInt(bufferedReader.readLine());
			PrimeFactors = new int[num / 2];
	 }

	 static void getPrimeFactors() {
			int n = num;
			sum = 0;
			counter = 0;
			PrimeFactors = new int[num / 2];
			while (n > 1) {
				 for (int i = 2; i <= n; i++) {
						if (n % i == 0) {
							 PrimeFactors[counter] = i;
							 counter++;
							 n /= i;
							 break;
						}
				 }
			}
	 }

	 static void display() {
			for (int i = 0; i < counter; i++) {
				 int pfn = PrimeFactors[i];
				 while (pfn >= 1) {
						sum += (pfn % 10);
						pfn /= 10;
				 }
			}
			int n = num;
			while (n >= 1) {
				 sumOfDigits += (n % 10);
				 n /= 10;
			}
			if (sum == sumOfDigits) {
				 System.out.println("SMITH Number");
			} else {
				 System.out.println("NOT SMITH Number");
			}
			System.out.println();
	 }
}
