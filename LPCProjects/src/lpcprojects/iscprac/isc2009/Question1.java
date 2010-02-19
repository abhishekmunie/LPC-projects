package lpcprojects.iscprac.isc2009;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question1 {

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
	 }

	 private static void input() throws IOException {
			System.out.print("DAY NUMBER: ");
			DAYNUMBER = Integer.parseInt(bufferedReader.readLine());
			System.out.print("YEAR: ");
			YEAR = Integer.parseInt(bufferedReader.readLine());
			System.out.print("DAY AFTER: ");
			DAYAFTER = Integer.parseInt(bufferedReader.readLine());
	 }
}
