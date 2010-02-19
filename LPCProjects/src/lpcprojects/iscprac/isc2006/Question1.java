package lpcprojects.iscprac.isc2006;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Question1 {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int N;
	 static int s;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			compute();
	 }

	 /**
	  * Accepts the value of N from the user.
	  * @throws IOException
	  */
	 static void input() throws IOException {
			System.out.print("N = ");
			N = Integer.parseInt(bufferedReader.readLine());
	 }

	 public static void compute() {
			for (int i = 1; i < N; i++) {
				 s = 0;
				 for (int j = i; j < N; j++) {
						s += j;
						if (s == N) {
							 for (int k = i; k <= j; k++) {
									System.out.print(k + " ");
							 }
							 System.out.println();
						}
				 }
			}
	 }
}
