package lpcprojects.schoolprograms.DateTime;

import java.io.*;
import java.util.Calendar;

/**
 *
 * @author Abhishek Munie
 */
public class DifferenceBetweenDates {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static String date1;
	 static int dd1;
	 static int mm1;
	 static int yyyy1;
	 static String date2;
	 static int dd2;
	 static int mm2;
	 static int yyyy2;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			display();
	 }

	 /**
	  * Accepts  from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("Enter First Date (mm/dd/yyyy): ");
			date1 = bufferedReader.readLine();
			System.out.print("Enter Second Date (mm/dd/yyyy): ");
			date2 = bufferedReader.readLine();
			Calendar.getInstance().
	 }

	 /**
	  * Displays .
	  */
	 static void display() {
	 }
}
