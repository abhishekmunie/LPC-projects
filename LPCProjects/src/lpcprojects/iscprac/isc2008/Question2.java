/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.iscprac.isc2008;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Abhishek
 */
public class Question2 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static String[] sentances;

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			display();
	 }

	 static void input() throws IOException {
			System.out.println("Enter the sentance: ");
			setSentances(bufferedReader.readLine());
	 }

	 static void setSentances(String str) {
			StringTokenizer stringTokenizer = new StringTokenizer(str, ".!?");
			sentances = new String[stringTokenizer.countTokens()];
			for (int i = 0; stringTokenizer.hasMoreTokens(); i++) {
				 sentances[i] = stringTokenizer.nextToken();
			}
	 }

	 static int countWords(String s) {
			StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
			return stringTokenizer.countTokens();
	 }

	 static int countVowels(String w) {
			int n = 0;
			for (int i = 0; i < w.length(); i++) {
				 switch (w.charAt(i)) {
						case 'A':
						case 'E':
						case 'I':
						case 'O':
						case 'U':
							 n++;
				 }
			}
			return n;
	 }

	 static void display() {
			System.out.println("Sentance\tNo. of Vowels\tNo. of Words");
			System.out.println("--------------------------------------------------");
			for (int i = 0; i < sentances.length; i++) {
				 System.out.println("\t" + (i + 1) + "\t\t" + countVowels(sentances[i]) + "\t\t" + countWords(sentances[i]));
			}
	 }
}
