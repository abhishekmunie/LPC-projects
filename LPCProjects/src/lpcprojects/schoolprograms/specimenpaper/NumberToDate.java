package lpcprojects.schoolprograms.specimenpaper;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class NumberToDate {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int nD;
	 static int day;
	 static int maxDay;
	 static String month;
	 static int year;

	 /**
	  * @param args the command line arguments
	  */
	 public static void main(String[] args) throws IOException {
			input();
			convert();
	 }

	 static void input() throws IOException {
			System.out.print("Enter a six digit number: ");
			nD = Integer.parseInt(bufferedReader.readLine());
			if ((nD < 100000) || (nD > 999999)) {
				 System.out.println("INVALID DATE");
				 System.exit(0);
			}
	 }

	 static void convert() {
			year = nD % 100;
			nD /= 100;
			switch (nD % 100) {
				 case 1:
						month = "January";
						maxDay = 31;
						break;
				 case 2:
						month = "February";
						if (isLeapYear()) {
							 maxDay = 29;
						} else {
							 maxDay = 28;
						}
						break;
				 case 3:
						month = "March";
						maxDay = 31;
						break;
				 case 4:
						month = "April";
						maxDay = 30;
						break;
				 case 5:
						month = "May";
						maxDay = 31;
						break;
				 case 6:
						month = "June";
						maxDay = 30;
						break;
				 case 7:
						month = "July";
						maxDay = 31;
						break;
				 case 8:
						month = "August";
						maxDay = 31;
						break;
				 case 9:
						month = "September";
						maxDay = 30;
						break;
				 case 10:
						month = "October";
						maxDay = 31;
						break;
				 case 11:
						month = "November";
						maxDay = 30;
						break;
				 case 12:
						month = "December";
						maxDay = 31;
						break;
				 default:
						System.out.println("INVALID DATE");
						System.exit(0);
			}
			nD /= 100;
			day = nD % 100;
			if (nD > maxDay) {
				 System.out.println("INVALID DATE");
				 System.exit(0);
			}
			System.out.print(day);
			if (day % 10 == 1) {
				 System.out.print("st");
			} else if (day % 10 == 2) {
				 System.out.print("nd");
			} else if (day % 10 == 3) {
				 System.out.print("rd");
			} else {
				 System.out.print("th");
			}
			System.out.println(" " + month + ", " + year);
			System.out.println("VALID DATE");
	 }

	 static boolean isLeapYear() {
			if (year % 4 == 0) {
				 return true;
			}
			return false;
	 }
}
