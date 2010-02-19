package lpcprojects.iscprac.isc2007;

import java.io.*;
import java.util.GregorianCalendar;

/**
 *
 * @author Abhishek
 */
public class Question1 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static String date;
	 static int dayOn_1_1;
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
			System.out.print("Day on 1st January : ");
			String dayOn = bufferedReader.readLine();
			if (dayOn.equalsIgnoreCase("MONDAY")) {
				 dayOn_1_1 = 0;
			} else if (dayOn.equalsIgnoreCase("TUESDAY")) {
				 dayOn_1_1 = 1;
			} else if (dayOn.equalsIgnoreCase("WEDSENDAY")) {
				 dayOn_1_1 = 2;
			} else if (dayOn.equalsIgnoreCase("THURSDAY")) {
				 dayOn_1_1 = 3;
			} else if (dayOn.equalsIgnoreCase("FRIDAY")) {
				 dayOn_1_1 = 4;
			} else if (dayOn.equalsIgnoreCase("SATUARDAY")) {
				 dayOn_1_1 = 5;
			} else if (dayOn.equalsIgnoreCase("SUNDAY")) {
				 dayOn_1_1 = 6;
			}
	 }

	 static void compute() {
			int idxd = date.indexOf('/');
			System.out.println("idxd: " + idxd);
			dd = Integer.parseInt(date.substring(0, idxd));
			int idxm = date.indexOf('/', (idxd + 1));
			System.out.println("idxm : " + idxm);
			mm = Integer.parseInt(date.substring((idxd + 1), idxm));
			yyyy = Integer.parseInt(date.substring(idxm + 1));
			int dayOffset = 0;
			switch (mm) {
				 case 12:
						dayOffset += 30;
				 case 11:
						dayOffset += 31;
				 case 10:
						dayOffset += 30;
				 case 9:
						dayOffset += 31;
				 case 8:
						dayOffset += 31;
				 case 7:
						dayOffset += 30;
				 case 6:
						dayOffset += 31;
				 case 5:
						dayOffset += 30;
				 case 4:
						dayOffset += 31;
				 case 3:
						if (new GregorianCalendar().isLeapYear(yyyy)) {
							 dayOffset += 29;
						} else {
							 dayOffset += 28;
						}
				 case 2:
						dayOffset += 31;
			}
			System.out.print("Day on " + date + " : ");
			switch ((dayOffset + dd + dayOn_1_1 - 1) % 7) {
				 case 0:
						System.out.println("MONDAY");
						break;
				 case 1:
						System.out.println("TUESDAY");
						break;
				 case 2:
						System.out.println("WEDSENDAY");
						break;
				 case 3:
						System.out.println("THURSDAY");
						break;
				 case 4:
						System.out.println("FRIDAY");
						break;
				 case 5:
						System.out.println("SATUARDAY");
						break;
				 case 6:
						System.out.println("SUNDAY");
						break;
			}
	 }
}
