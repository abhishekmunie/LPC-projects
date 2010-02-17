/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.specimenpaper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

//	 static void vowelSort() {
//			int bi = 0;
//			int ei = 0;
//			for (;;) {
//				 if (str.indexOf('.', ei) != -1) {
//						ei = str.indexOf('.', ei);
//				 } else if (str.indexOf(',', ei) != -1) {
//						ei = str.indexOf(',', ei);
//				 } else if (str.indexOf('!', ei) != -1) {
//						ei = str.indexOf('!', ei);
//				 } else if (str.indexOf('?', ei) != -1) {
//						ei = str.indexOf('?', ei);
//				 } else {
//						break;
//				 }
//				 sort(str.substring(bi, ei));
//				 bi++;
//			}
//	 }
	 static void vowelSort() {
			for (StringTokenizer stringTokenizer1 = new StringTokenizer(str, ".,!?", true); stringTokenizer1.hasMoreTokens();) {
				 System.out.print(SelectionSort(getTokenArray(stringTokenizer1.nextToken())));
			}
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
				 s += Sorted[i] + " ";
//				 if (i < Sorted.length - 1) {
//						s += " ";
//				 }
			}
			return s;
	 }

	 static String[] getTokenArray(String toBeSorted) {
			System.out.println("~~" + toBeSorted);
			StringTokenizer tokenizer = new StringTokenizer(toBeSorted, " \t\n\r\f", true);
			String[] Sorted = new String[(int)Math.ceil(tokenizer.countTokens() / 2)];
			for (int i = 0; tokenizer.hasMoreTokens(); i++) {
				 Sorted[i] = tokenizer.nextToken();
				 if (tokenizer.hasMoreTokens()) {
						Sorted[i] += tokenizer.nextToken();
				 }
				 System.out.println("~~~" + Sorted[i]);
			}
			return Sorted;
	 }
}
