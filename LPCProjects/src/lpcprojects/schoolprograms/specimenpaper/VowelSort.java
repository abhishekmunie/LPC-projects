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
			System.out.println("");
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
				 sort(stringTokenizer1.nextToken());
			}
	 }

	 static void sort(String s) {
			StringTokenizer stringTokenizer = new StringTokenizer(s, " \t\n\r\f", true);
			while (stringTokenizer.hasMoreTokens()) {
				 String token = stringTokenizer.nextToken();

			}
	 }
}
