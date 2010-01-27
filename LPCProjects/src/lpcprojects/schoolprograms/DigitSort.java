package lpcprojects.schoolprograms;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class DigitSort {

			static int num;
			static int[] Dsort = new int[4];

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						input();
						sort();
						display();
			}

			static void input() throws IOException {
						BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
						System.out.print("Enter a four digit no.: ");
						num = Integer.parseInt(BR.readLine());
						for (int i = 0; i < 4; i++) {
									Dsort[i] = num % 10;
									num /= 10;
						}
			}

			static void sort() {
						int pos, temp;
						for (int i = 0; i < Dsort.length; i++) {
									pos = i;
									for (int j = i; j < Dsort.length; j++) {
												if (Dsort[j] < Dsort[pos]) {
															pos = j;
												}
									}
									temp = Dsort[i];
									Dsort[i] = Dsort[pos];
									Dsort[pos] = temp;
						}
			}

			static void display() {
						for (int i = 0; i < Dsort.length; i++) {
									System.out.print(Dsort[i]);
									if (i < (Dsort.length - 1)) {
												System.out.print(",");
									}
						}
						System.out.println();
			}
}
