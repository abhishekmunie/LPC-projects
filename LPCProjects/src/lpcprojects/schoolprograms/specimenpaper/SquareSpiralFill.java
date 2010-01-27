package lpcprojects.schoolprograms.specimenpaper;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class SquareSpiralFill {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int N;
	 static int[][] Spiral;

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			inputSpiral();
			display();
	 }

	 static void input() throws IOException {
			System.out.print("Enter the value of N: ");
			N = Integer.parseInt(bufferedReader.readLine());
			Spiral = new int[N][N];
	 }

	 static void inputSpiral() throws IOException {
			int num = 1;
			for (int i = 0; i < N; i++) {
				 for (int j = i; j < N - i; j++) {
						Spiral[i][j] = num++;
				 }
				 for (int k = i + 1; k < N - i; k++) {
						Spiral[k][N - 1 - i] = num++;
				 }
				 for (int l = N - i - 2; l >= i; l--) {
						Spiral[N - 1 - i][l] = num++;
				 }
				 for (int m = N - i - 2; m > i; m--) {
						Spiral[m][i] = num++;
				 }
			}
	 }

	 static void display() {
			for (int i = 0; i < N; i++) {
				 for (int j = 0; j < N; j++) {
						System.out.print(Spiral[i][j] + "\t");
				 }
				 System.out.println();
			}
	 }
}
