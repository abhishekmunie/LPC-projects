package lpcprojects.schoolprograms.preboard;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Sorts the word of a sentance in decending order on the basis of their size.
 * @author Abhishek Munie
 */
public class WordLengthDecendingSort {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static String[] wordArray;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException 
	  */
	 public static void main(String[] args) throws IOException {
			System.out.println("Enter the sentance to be sorted.");
			String s = bufferedReader.readLine();
			if (s.length() > 80) {
				 System.out.println("The sentance exceeds the word limits.");
				 System.exit(0);
			}
			createTokenArray(s);
			Sort();
			for (int i = 0; i < wordArray.length; i++) {
				 System.out.print(captalizeFirstCharacter(wordArray[i]));
				 if (i < wordArray.length - 1) {
						System.out.print(" ");
				 }
			}
			System.out.println(".");
	 }

	 /**
	  * Converts the sentance toBeTokanized into an array of tokens.
	  * @param toBeTokanized sentance to be tokanized.
	  * @return Array of base type String storing the array of tokens.
	  */
	 static String[] createTokenArray(String toBeTokanized) {
			StringTokenizer tokenizer = new StringTokenizer(toBeTokanized, " .");
			wordArray = new String[tokenizer.countTokens()];
			for (int i = 0; tokenizer.hasMoreTokens(); i++) {
				 wordArray[i] = tokenizer.nextToken();
			}
			return wordArray;
	 }

	 /**
	  * Sorts the array of tokens.
	  */
	 static void Sort() {
			int minP;
			String temp;
			for (int i = 0; i < wordArray.length; i++) {
				 minP = i;
				 for (int j = i + 1; j < wordArray.length; j++) {
						if (wordArray[j].length() > wordArray[minP].length()) {
							 minP = j;
						}
				 }
				 temp = wordArray[i];
				 wordArray[i] = wordArray[minP];
				 wordArray[minP] = temp;
			}
	 }

	 /**
	  * Captalizes the first character of the string passed.
	  * @param s String whose first character is to be captalized.
	  * @return String with first character captalized
	  */
	 static String captalizeFirstCharacter(String s) {
			return s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(s.toUpperCase().charAt(0)));
	 }
}
