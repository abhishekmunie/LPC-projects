package lpcprojects.schoolprograms.DateTime;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

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
			System.out.print("Date (dd/mm/yyyy) : ");
			date = bufferedReader.readLine();
	 }

	 static void compute() {
			StringTokenizer stringTokenizer = new StringTokenizer(date, "/");
			dd = Integer.parseInt(stringTokenizer.nextToken());
			mm = Integer.parseInt(stringTokenizer.nextToken());
			yyyy = Integer.parseInt(stringTokenizer.nextToken());
			Calendar c = Calendar.getInstance();
			c.set(Calendar.DAY_OF_MONTH, dd);
			c.set(Calendar.MONTH, (mm - 1));
			c.set(Calendar.YEAR, yyyy);
			System.out.print("Day on " + date + " : ");
			switch (c.get(Calendar.DAY_OF_WEEK)) {
				 case Calendar.MONDAY:
						System.out.print("MONDAY");
						break;
				 case Calendar.TUESDAY:
						System.out.print("TUESDAY");
						break;
				 case Calendar.WEDNESDAY:
						System.out.print("WEDNESDAY");
						break;
				 case Calendar.THURSDAY:
						System.out.print("THURSDAY");
						break;
				 case Calendar.FRIDAY:
						System.out.print("FRIDAY");
						break;
				 case Calendar.SATURDAY:
						System.out.print("SATURDAY");
						break;
				 case Calendar.SUNDAY:
						System.out.print("SUNDAY");
						break;
			}
	 }
}
