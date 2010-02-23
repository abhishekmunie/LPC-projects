package lpcprojects.schoolprograms.Matrix;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class SpiralFill {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int N;
	 static int[][] matrix;

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			System.out.println("Top Left Clockwise Spiral Fill:");
			matrix = new int[N][N];
			TopLeftClockwiseSpiral();
			display();
			System.out.println("\nTop Left Counter clockwise Spiral Fill:");
			matrix = new int[N][N];
			TopLeftCounterclockwiseSpiral();
			display();
			System.out.println("\nIn to Out Clockwise Spiral Fill:");
			matrix = new int[N][N];
			InToOut();
			display();
			System.out.println("\nIn to Out from Top Clockwise Spiral Fill:");
			matrix = new int[N][N];
			InToOutTop();
			display();
			System.out.println("\nIn to Out from Right Clockwise Spiral Fill:");
			matrix = new int[N][N];
			InToOutRight();
			display();
			System.out.println("\nIn to Out from Bottom Clockwise Spiral Fill:");
			matrix = new int[N][N];
			InToOutBottom();
			display();
	 }

	 static void input() throws IOException {
			System.out.print("Enter the value of N: ");
			N = Integer.parseInt(bufferedReader.readLine());
			matrix = new int[N][N];
	 }

	 static void TopLeftClockwiseSpiral() {
			int num = 1;
			for (int i = 0; i < Math.ceil(N / 2.0f); i++) {
				 for (int j = i; j <= N - 1 - i; j++) {
						matrix[i][j] = num++;
				 }
				 for (int k = i + 1; k <= N - 1 - i; k++) {
						matrix[k][N - 1 - i] = num++;
				 }
				 for (int l = N - i - 2; l >= i; l--) {
						matrix[N - 1 - i][l] = num++;
				 }
				 for (int m = N - 2 - i; m > i; m--) {
						matrix[m][i] = num++;
				 }
			}
	 }

	 static void TopLeftCounterclockwiseSpiral() {
			int num = 1;
			for (int i = 0; i < N; i++) {
				 for (int m = i; m <= N - i - 1; m++) {
						matrix[m][i] = num++;
				 }
				 for (int l = i + 1; l <= N - 1 - i; l++) {
						matrix[N - 1 - i][l] = num++;
				 }
				 for (int k = N - 2 - i; k >= i; k--) {
						matrix[k][N - 1 - i] = num++;
				 }
				 for (int j = N - 2 - i; j > i; j--) {
						matrix[i][j] = num++;
				 }
			}
	 }

	 static void InToOut() {
			int num = 1;
			for (int i = (int) (Math.ceil(N / 2.0f) - 1); i >= 0; i--) {
				 for (int j = i; j <= N - 1 - i; j++) {
						matrix[i][j] = num++;
				 }
				 for (int k = i + 1; k <= N - 1 - i; k++) {
						matrix[k][N - 1 - i] = num++;
				 }
				 for (int l = N - i - 2; l >= i; l--) {
						matrix[N - 1 - i][l] = num++;
				 }
				 for (int m = N - 2 - i; m > i; m--) {
						matrix[m][i] = num++;
				 }
			}
	 }

	 static void InToOutTop() {
			int num = 1;
			for (int i = (int) (Math.ceil(N / 2.0f) - 1); i >= 0; i--) {
				 for (int j = i + 1; j <= N - 2 - i; j++) {
						matrix[i][j] = num++;
				 }
				 for (int k = i; k <= N - 1 - i; k++) {
						matrix[k][N - 1 - i] = num++;
				 }
				 for (int l = N - 2 - i; l >= i; l--) {
						matrix[N - 1 - i][l] = num++;
				 }
				 for (int m = N - 2 - i; m >= i; m--) {
						matrix[m][i] = num++;
				 }
			}
	 }

	 static void InToOutRight() {
			int num = 1;
			for (int i = (int) (Math.ceil(N / 2.0f) - 1); i >= 0; i--) {
				 for (int k = i + 1; k <= N - 2 - i; k++) {
						matrix[k][N - 1 - i] = num++;
				 }
				 for (int l = N - 1 - i; l >= i; l--) {
						matrix[N - 1 - i][l] = num++;
				 }
				 for (int m = N - 2 - i; m >= i; m--) {
						matrix[m][i] = num++;
				 }
				 for (int j = i + 1; j <= N - 1 - i; j++) {
						matrix[i][j] = num++;
				 }
			}
	 }

	 static void InToOutBottom() {
			int num = 1;
			for (int i = (int) (Math.ceil(N / 2.0f) - 1); i >= 0; i--) {
				 for (int l = N - 2 - i; l >= i; l--) {
						matrix[N - 1 - i][l] = num++;
				 }
				 for (int m = N - 2 - i; m >= i; m--) {
						matrix[m][i] = num++;
				 }
				 for (int j = i + 1; j <= N - 2 - i; j++) {
						matrix[i][j] = num++;
				 }
				 for (int k = i; k <= N - 1 - i; k++) {
						matrix[k][N - 1 - i] = num++;
				 }
			}
	 }

	 static void display() {
			for (int i = 0; i < N; i++) {
				 for (int j = 0; j < N; j++) {
						System.out.print(matrix[i][j] + "\t");
				 }
				 System.out.println();
			}
	 }
}
