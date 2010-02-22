package lpcprojects.iscprac.specimenpaper2010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.StringTokenizer;

/**
 * @author Abhishek
 */
public class VowelSort {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static String str;

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			vowelSort();
	 }

	 static void input() throws IOException {
			System.out.print("INPUT: ");
			str = bufferedReader.readLine();
	 }

	 static void vowelSort() {
			for (StringTokenizer stringTokenizer1 = new StringTokenizer(str, ".,!?", true); stringTokenizer1.hasMoreTokens();) {
				 System.out.print(SelectionSort(getTokenArray(stringTokenizer1.nextToken())) + stringTokenizer1.nextToken() + " ");
			}
			System.out.println();
	 }

	 static String SelectionSort(String[] Sorted) {
			int minP;
			String temp;
			for (int i = 0; i < Sorted.length; i++) {
				 minP = i;
				 for (int j = i + 1; j < Sorted.length; j++) {
						if (Sorted[j].compareTo(Sorted[minP]) < 0) {
							 minP = j;
						}
				 }
				 temp = Sorted[i];
				 Sorted[i] = Sorted[minP];
				 Sorted[minP] = temp;
			}
			String s = new String();
			for (int i = 0; i < Sorted.length; i++) {
				 s += Sorted[i];
				 if (i < Sorted.length - 1) {
						s += " ";
				 }
			}
			return s;
	 }

	 static String[] getTokenArray(String toBeSorted) {
			StringTokenizer tokenizer = new StringTokenizer(toBeSorted);
			String[] Sorted = new String[tokenizer.countTokens()];
			for (int i = 0; tokenizer.hasMoreTokens(); i++) {
				 Sorted[i] = tokenizer.nextToken();
			}
			return Sorted;
	 }
}
