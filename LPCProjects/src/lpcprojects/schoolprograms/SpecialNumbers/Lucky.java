package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Abhishek
 */
public class Lucky {

			static int num;
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
									System.out.println("Lucky Numbers: " + Arrays.toString(luckySeries));
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
			}

			static void computeLuckey() {
						int n = 1;
						for (numSeries = luckySeries; luckySeries.length < n; n++) {
									luckySeries = new int[luckySeries.length * (1 - (1 / n))];
									for (int i = 1; i < numSeries.length; i++) {
												if (i % n != 0) {
															luckySeries[i] = numSeries[i];
												}
									}
						}
			}
}
