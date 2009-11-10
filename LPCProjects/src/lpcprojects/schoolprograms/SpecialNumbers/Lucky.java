package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Abhishek
 */
public class Lucky {

			static int count;
			static int[] numSeries, luckySeries;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									computeLuckey();
									System.out.println();
									printLucky();
									System.out.println();
									System.out.println("Do you want to continue?(yes/no)");
									if (BR.readLine().equalsIgnoreCase("no")) {
												break;
									}
									System.out.println();
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the no. to be checked to be an Armstrong no.: ");
						numSeries = new int[Integer.parseInt(BR.readLine())];
						for (int i = 0; i < numSeries.length; i++) {
									numSeries[i] = i + 1;
						}
						luckySeries = numSeries;
						count = numSeries.length;
						printLucky();
			}

			static void computeLuckey() {
						int n = 2;
						int c = 0;
						for (count = numSeries.length; count >= n; n++) {
									System.out.println("ok");
									c = 0;
									for (int i = 0; i < count; i++) {
												System.out.println("i%n = " + (i % n));
												if (((i + 1) % n) != 0) {
															luckySeries[c] = numSeries[i];
															c++;
												}
									}
									count = c;
									System.out.println("count: " + count);
									printLucky();
									numSeries = luckySeries;
						}
			}

			static void printLucky() {
						System.out.println("Lucky Numbers: ");
						System.out.println(Arrays.toString(luckySeries));
						System.out.print(luckySeries[0]);
						for (int i = 1; i < count; i++) {
									System.out.print(", " + luckySeries[i]);

						}
			}
}
