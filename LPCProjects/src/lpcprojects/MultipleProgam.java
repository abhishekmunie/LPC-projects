package lpcprojects;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class MultipleProgam {

	 static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			outer:
			for (;;) {
				 System.out.println("Choices:");
				 System.out.println("1 - Leap Year");
				 System.out.println("2 - Centuary Year");
				 System.out.println("3 - Decimal to Binary");
				 System.out.println("4 - Binary to Decimal");
				 System.out.println("5 - Calculate the value of"
				 + " (((2*Math.pow(A, 3))/(3*Math.pow(B, 3)))+ ((4*Math.pow(C, 2))/(5*Math.pow(D, 2)))+((6*A)/(7*B)))");
				 System.out.println("6 - Absolute Value");
				 System.out.println("7 - Sum of First and Last Digit");
				 System.out.println("8 - Prime Factores");
				 System.out.println("9 - Number of Digits");
				 System.out.println("10 - Armstrong");
				 System.out.println("11 - Automorphic");
				 System.out.println("12 - Factorial");
				 System.out.print("Enter your choice: ");
				 int choice = Integer.parseInt(BR.readLine());
				 System.out.println();
				 switch (choice) {
						case 1:
							 LeapYear();
							 break;
						case 2:
							 CentuaryYear();
							 break;
						case 3:
							 DecimalToBinary();
							 break;
						case 4:
							 BinaryToDecimal();
							 break;
						case 5:
							 Compute();
							 break;
						case 6:
							 AbsoluteValue();
							 break;
						case 7:
							 Sum_of_First_and_Last_Digit();
							 break;
						case 8:
							 PrimeFactors();
							 break;
						case 9:
							 Number_of_Digits();
							 break;
						case 10:
							 Armstrong();
							 break;
						case 11:
							 Automorphic();
							 break;
						case 12:
							 Factorial();
							 break;
						default:
							 System.out.println("Wrong Choice!");
							 continue outer;
				 }
				 for (;;) {
						System.out.println();
						System.out.println("Do you want to continue? (yes/no)");
						String c = BR.readLine();
						System.out.println();
						if (c.equalsIgnoreCase("yes")) {
							 break;
						} else if (c.equalsIgnoreCase("no")) {
							 System.exit(0);
						} else {
							 System.out.println("Invalid Entry.\n");
							 continue;
						}
				 }
			}
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void LeapYear() throws IOException {
			System.out.print("Enter a year to check for leap year: ");
			int year = Integer.parseInt(BR.readLine());
			if (year % 4 == 0) {
				 System.out.println("The year is a leap year.");
			} else {
				 System.out.println("The year is not a leap year.");
			}
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void CentuaryYear() throws IOException {
			System.out.print("Enter a year to check for centuary year: ");
			int year = Integer.parseInt(BR.readLine());
			if (year % 100 == 0) {
				 System.out.println("The year is a leap year.");
			} else {
				 System.out.println("The year is not a leap year.");
			}
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void DecimalToBinary() throws IOException {
			System.out.print("Enter the decimal number to be converted to binary: ");
			long n = Integer.parseInt(BR.readLine());
			long r = 0;
			for (int i = 0; n >= 1; i++) {
				 r += (n % 2) * Math.pow(10, i);
				 n /= 2;
			}
			System.out.println("The binary equivalent of the decimal number is: " + r);
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void BinaryToDecimal() throws IOException {
			System.out.print("Enter the binary number to be converted to decimal: ");
			long n = Integer.parseInt(BR.readLine());
			long r = 0;
			long p, q, d, m = 0, num = n;
			while (num != 0) {
				 q = num / 10;
				 p = q * 10;
				 d = num - p;
				 if (d > 1 || d < 0) {
						System.out.println("The no. you entered is not a binary no.");
				 }
				 r = (int) (r + d * Math.pow(2, m));
				 num = q;
				 m++;
			}
			System.out.println("The decimal equivalent of the binary number is: " + r);
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void Compute() throws IOException {
			System.out.print("Enter the value of A: ");
			int A = Integer.parseInt(BR.readLine());
			System.out.print("Enter the value of B: ");
			int B = Integer.parseInt(BR.readLine());
			System.out.print("Enter the value of C: ");
			int C = Integer.parseInt(BR.readLine());
			System.out.print("Enter the value of D: ");
			int D = Integer.parseInt(BR.readLine());
			System.out.println("Result: "
							+ (((2 * Math.pow(A, 3)) / (3 * Math.pow(B, 3)))
							+ ((4 * Math.pow(C, 2)) / (5 * Math.pow(D, 2)))
							+ ((6 * A) / (7 * B))));
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void AbsoluteValue() throws IOException {
			System.out.print("Enter the number to calculate its absolute value: ");
			int n = Integer.parseInt(BR.readLine());
			if (n < 0) {
				 n = -n;
			}
			System.out.println("The Absolute Value is: " + n);
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void Number_of_Digits() throws IOException {
			System.out.print("Enter the number to calculate its no. of digits: ");
			int n = Integer.parseInt(BR.readLine());
			int digitCount = 0;
			while (n >= 1) {
				 n /= 10;
				 digitCount++;
			}
			System.out.println("The number of digits is: " + digitCount);
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void Armstrong() throws IOException {
			System.out.print("Enter the number: ");
			int num = Integer.parseInt(BR.readLine());
			int n = num;
			int sum = 0;
			while (n > 0) {
				 sum += Math.pow(n % 10, 3);
				 n /= 10;
			}
			if (sum == num) {
				 System.out.println("The no. is an Armstrong no.");
			} else {
				 System.out.println("The no. is not an Armstrong no.");
			}
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void Automorphic() throws IOException {
			System.out.print("Enter the number: ");
			int num = Integer.parseInt(BR.readLine());
			int auto = (int) Math.pow(num, 2);
			while (num >= 1) {
				 if ((num % 10) != (auto % 10)) {
						System.out.println("The no. is not an Armstrong no.");
						return;
				 }
				 num /= 10;
				 auto /= 10;
			}
			System.out.println("The no. is an Armstrong no.");
	 }

	 /**
	  *
	  * @throws IOException
	  */
	 public static void Sum_of_First_and_Last_Digit() throws IOException {
			System.out.print("Enter the number: ");
			int num = Integer.parseInt(BR.readLine());
			int n = num;
			while (n > 10) {
				 n /= 10;
			}
			System.out.println("The sum of digits is: " + ((num % 10) + n));
	 }

	 /**
	  * Returns the prime getFactors of the number in form of an int Array.
	  * @throws IOException
	  */
	 public static void PrimeFactors() throws IOException {
			System.out.print("Enter the number: ");
			int num = Integer.parseInt(BR.readLine());
			if (num < 0) {
				 System.out.println("The no. whose prime factors have to be found should not be less than one.");
			}
			while (num > 1) {
				 for (int i = 2; i <= num; i++) {
						if (num % i == 0) {
							 System.out.println(i + "\t");
							 num /= i;
							 break;
						}
				 }
			}
	 }

	 /**
	  * Returns the factorial of the number.
	  * @throws IOException
	  */
	 public static void Factorial() throws IOException {
			System.out.print("Enter the number: ");
			int num = Integer.parseInt(BR.readLine());
			if (num < 0) {
				 System.out.println("The no. whose factorial has to be found sould not be less than one.");
			}
			if (num == 0) {
				 System.out.println("The factorial of the number is: 1");
			}
			long f = 1;
			for (int i = 1; i <= num; i++) {
				 f *= i;
			}
			System.out.println("The factorial of the number is: " + f);
	 }
}
