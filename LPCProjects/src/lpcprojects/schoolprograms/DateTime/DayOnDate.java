package lpcprojects.schoolprograms.DateTime;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Abhishek Munie
 */
public class DayOnDate {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static String date;
	 static int dd;
	 static int mm;
	 static int yyyy;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			compute();
	 }

	 /**
	  * Accepts dat ond day on 1st January from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("Date : ");
			date = bufferedReader.readLine();
	 }

	 static void compute() {
			int idxd = date.indexOf('/');
			mm = Integer.parseInt(date.substring(0, idxd));
			if ((mm > 12) && (mm < 1)) {
				 System.out.println("Invalid Month!");
				 System.exit(0);
			}
			int idxm = date.indexOf('/', (idxd + 1));
			dd = Integer.parseInt(date.substring((idxd + 1), idxm));
			yyyy = Integer.parseInt(date.substring(idxm + 1));
			int maxDay = 0;
			switch (mm) {
				 case 1:
						maxDay = 31;
						break;
				 case 2:
						if (new GregorianCalendar().isLeapYear(yyyy)) {
							 maxDay = 29;
						} else {
							 maxDay = 28;
						}
						break;
				 case 3:
						maxDay = 31;
						break;
				 case 4:
						maxDay = 30;
						break;
				 case 5:
						maxDay = 31;
						break;
				 case 6:
						maxDay = 30;
						break;
				 case 7:
						maxDay = 31;
						break;
				 case 8:
						maxDay = 31;
						break;
				 case 9:
						maxDay = 30;
						break;
				 case 10:
						maxDay = 31;
						break;
				 case 11:
						maxDay = 30;
						break;
				 case 12:
						maxDay = 31;
						break;
				 default:
						System.out.println("Invalid Month!");
						System.exit(0);
			}
			if (dd > maxDay) {
				 System.out.println("Invalid Day!");
				 System.exit(0);
			}
			Calendar c = new GregorianCalendar();
			c.set(yyyy, mm, dd);
			System.out.print("Day on " + date + " : ");
			switch (c.get(Calendar.DAY_OF_WEEK)) {
				 case Calendar.MONDAY:
						System.out.println("MONDAY");
						break;
				 case Calendar.TUESDAY:
						System.out.println("TUESDAY");
						break;
				 case Calendar.WEDNESDAY:
						System.out.println("WEDSENDAY");
						break;
				 case Calendar.THURSDAY:
						System.out.println("THURSDAY");
						break;
				 case Calendar.FRIDAY:
						System.out.println("FRIDAY");
						break;
				 case Calendar.SATURDAY:
						System.out.println("SATUARDAY");
						break;
				 case Calendar.SUNDAY:
						System.out.println("SUNDAY");
						break;
			}
	 }
}
