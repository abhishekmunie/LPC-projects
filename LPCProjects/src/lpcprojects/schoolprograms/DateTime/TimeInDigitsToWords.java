package lpcprojects.schoolprograms.DateTime;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class TimeInDigitsToWords {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int hr;
	 static int min;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			int n = 12;
			System.out.println(Integer.toString(n));
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Long.MAX_VALUE);
			input();
			display();
	 }

	 /**
	  * Accepts time as digits from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.println("Time : ");
			System.out.print("Hour: ");
			hr = Integer.parseInt(bufferedReader.readLine());
			System.out.print("Minutes: ");
			min = Integer.parseInt(bufferedReader.readLine());
	 }

	 /**
	  * Displays time in words to the user.
	  */
	 static void display() {
			if ((hr < 1) || (hr > 12)) {
				 System.out.println("Incorrect");
				 return;
			}
			if ((min < 0) || (min > 59)) {
				 System.out.println("Incorrect");
				 return;
			}
			if (min == 0) {
				 System.out.println(toWords2(hr) + " o'clock");
				 return;
			} else if (min == 15) {
				 System.out.print("Quarter past ");
			} else if (min < 30) {
				 System.out.print(toWords2(min) + " past ");
			} else if (min == 30) {
				 System.out.print("Half past");
			} else if (min == 45) {
				 System.out.print("Quarter to ");
				 hr++;
			} else if (min > 30) {
				 System.out.print(toWords2(min) + " to ");
				 hr++;
			}
			if (hr == 13) {
				 hr = 1;
			}
			System.out.println(toWords2(hr));
	 }

	 private static String toWords2(int num) {
			if (num < 10) {
				 return toWords1(num);
			} else if (num < 20) {
				 switch (num) {
						case 10:
							 return "Ten";
						case 11:
							 return "Eleven";
						case 12:
							 return "Twelve";
						case 13:
							 return "Thirteen";
						case 14:
							 return toWords1(num / 10) + "teen";
						case 15:
							 return "Fifteen";
						case 16:
							 return toWords1(num / 10) + "teen";
						case 17:
							 return toWords1(num / 10) + "teen";
						case 18:
							 return toWords1(num / 10) + "teen";
						case 19:
							 return toWords1(num / 10) + "teen";
				 }
			} else if (num == 20) {
				 return "Twenty";
			} else if (num < 30) {
				 return "Twenty " + toWords1(num % 10);
			} else if (num == 30) {
				 return "Thirty";
			} else if (num < 40) {
				 return "Thirty " + toWords1(num % 10);
			} else if (num == 40) {
				 return "Fourty";
			} else if (num < 50) {
				 return "Fourty " + toWords1(num % 10);
			} else if (num == 50) {
				 return "Fifty";
			} else if (num < 60) {
				 return "Fifty " + toWords1(num % 10);
			} else if (num == 60) {
				 return "Sixty";
			} else if (num < 70) {
				 return "Sixty " + toWords1(num % 10);
			} else if (num == 70) {
				 return "Seventy";
			} else if (num < 80) {
				 return "Seventy " + toWords1(num % 10);
			} else if (num == 80) {
				 return "Eighty";
			} else if (num < 90) {
				 return "Eighty " + toWords1(num % 10);
			} else if (num == 90) {
				 return "Ninty";
			} else if (num < 100) {
				 return "Ninty " + toWords1(num % 10);
			}
			return "";
	 }

	 private static String toWords1(int num) {
			switch (num) {
				 case 0:
						return "Zero";
				 case 1:
						return "One";
				 case 2:
						return "Two";
				 case 3:
						return "Three";
				 case 4:
						return "Four";
				 case 5:
						return "Five";
				 case 6:
						return "Six";
				 case 7:
						return "Seven";
				 case 8:
						return "Eight";
				 case 9:
						return "Nine";
			}
			return "";
	 }
}
