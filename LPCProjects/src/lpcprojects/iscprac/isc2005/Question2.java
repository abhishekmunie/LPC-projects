package lpcprojects.iscprac.isc2005;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question2 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static String word;
	 static int count;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
	 }

	 /**
	  * Accepts the world and prints anagram from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("Enter a word: ");
			System.out.println("Anagrams:\n" + rearrange("", bufferedReader.readLine()));
			System.out.println("Total number of anagrams = " + count);
	 }

	 /**
		* Rearranges words of String s, with all starting with String st.
		* @param st The String with which all the rearranged form of String s will start.
		* @param s The String to be rearranged.
		* @return
		*/
	 static String rearrange(String st, String s) {
			String sR = "";
			for (int i = 0; i < s.length(); i++) {
				 if (s.length() > 1) {
						sR += rearrange(st + s.charAt(i), new StringBuffer(s).deleteCharAt(i).toString());
				 } else {
						sR += st + s + "\n";
						count++;
				 }
			}
			return sR;
	 }
}
