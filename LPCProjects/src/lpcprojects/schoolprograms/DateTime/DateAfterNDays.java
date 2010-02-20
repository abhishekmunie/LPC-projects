package lpcprojects.schoolprograms.DateTime;

import lpcprojects.iscprac.isc2009.*;
import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 *
 * @author Abhishek
 */
public class DateAfterNDays {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int DAYNUMBER;
	 static int YEAR;
	 static int DAYAFTER;

	 /**
	  *
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			calculate();
	 }

	 static void input() throws IOException {
			System.out.print("DAY NUMBER: ");
			DAYNUMBER = Integer.parseInt(bufferedReader.readLine());
			System.out.print("YEAR: ");
			YEAR = Integer.parseInt(bufferedReader.readLine());
			System.out.print("DAY AFTER(N): ");
			DAYAFTER = Integer.parseInt(bufferedReader.readLine());
	 }

	 static void calculate() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.YEAR, YEAR);
			c.set(Calendar.DAY_OF_YEAR, DAYNUMBER);
			System.out.print(c.get(Calendar.DATE));
			if (c.get(Calendar.DATE) % 10 == 1) {
				 System.out.print("st");
			} else if (c.get(Calendar.DATE) % 10 == 2) {
				 System.out.print("nd");
			} else if (c.get(Calendar.DATE) % 10 == 3) {
				 System.out.print("rd");
			} else {
				 System.out.print("th");
			}
			System.out.println(" " + getMonth(c.get(Calendar.MONTH)) + " " + c.get(Calendar.YEAR));
			c.set(Calendar.DAY_OF_YEAR, (DAYNUMBER + DAYAFTER));
			System.out.print("DATE AFTER " + DAYAFTER + " DAYS: ");
			System.out.print(c.get(Calendar.DATE));
			if (c.get(Calendar.DATE) % 10 == 1) {
				 System.out.print("st");
			} else if (c.get(Calendar.DATE) % 10 == 2) {
				 System.out.print("nd");
			} else if (c.get(Calendar.DATE) % 10 == 3) {
				 System.out.print("rd");
			} else {
				 System.out.print("th");
			}
			System.out.println(" " + getMonth(c.get(Calendar.MONTH)) + " " + c.get(Calendar.YEAR));
	 }

	 static String getMonth(int m) {
			switch (m % 12) {
				 case Calendar.JANUARY:
						return "JANUARY";
				 case Calendar.FEBRUARY:
						return "FEBRUARY";
				 case Calendar.MARCH:
						return "MARCH";
				 case Calendar.APRIL:
						return "APRIL";
				 case Calendar.MAY:
						return "MAY";
				 case Calendar.JUNE:
						return "JUNE";
				 case Calendar.JULY:
						return "JULY";
				 case Calendar.AUGUST:
						return "AUGUST";
				 case Calendar.SEPTEMBER:
						return "SEPTEMBER";
				 case Calendar.OCTOBER:
						return "OCTOBER";
				 case Calendar.NOVEMBER:
						return "NOVEMBER";
				 case Calendar.DECEMBER:
						return "DECEMBER";
				 default:
						return "";
			}
	 }
}
