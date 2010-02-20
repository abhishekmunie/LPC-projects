/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.Matrix;

import lpcprojects.schoolprograms.specimenpaper.*;
import java.io.*;

/**
 *
 * @author Abhishek
 */
public class SpiralFill {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 static int N;
	 static int[][] Spiral;

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			input();
			System.out.println("Top Left Clockwise Spiral Fill:");
			TopLeftClockwiseSpiral();
			display();
			System.out.println("\nTop Left Counter clockwise Spiral Fill:");
			TopLeftCounterclockwiseSpiral();
			display();
	 }

	 static void input() throws IOException {
			System.out.print("Enter the value of N: ");
			N = Integer.parseInt(bufferedReader.readLine());
			Spiral = new int[N][N];
	 }

	 static void TopLeftClockwiseSpiral() throws IOException {
			int num = 1;
			for (int i = 0; i < Spiral.length; i++) {
				 for (int j = i; j < Spiral[i].length - i; j++) {
						Spiral[i][j] = num++;
				 }
				 for (int k = i + 1; k < Spiral.length - i; k++) {
						Spiral[k][Spiral[i].length - 1 - i] = num++;
				 }
				 for (int m = Spiral.length - i - 1; m > i; m--) {
						Spiral[m][i] = num++;
				 }
				 for (int l = Spiral[Spiral.length - 1 - i].length - i - 2; l > i; l--) {
						Spiral[Spiral.length - 1 - i][l] = num++;
				 }
			}
	 }

	 static void TopLeftCounterclockwiseSpiral() throws IOException {
			int num = 1;
			for (int i = 0; i < Spiral.length; i++) {
				 for (int m = i; m <= Spiral.length - i - 1; m++) {
						Spiral[m][i] = num++;
				 }
				 for (int l = i + 1; l <= Spiral[Spiral.length - 1 - i].length - 1 - i; l++) {
						Spiral[Spiral.length - 1 - i][l] = num++;
				 }
				 for (int k = Spiral.length - 2 - i; k >= i; k--) {
						Spiral[k][Spiral.length - 1 - i] = num++;
				 }
				 for (int j = Spiral[i].length - 2 - i; j > i; j--) {
						Spiral[i][j] = num++;
				 }
			}
	 }

	 static void InToOut
	 static void display() {
			for (int i = 0; i < Spiral.length; i++) {
				 for (int j = 0; j < Spiral[i].length; j++) {
						System.out.print(Spiral[i][j] + "\t");
				 }
				 System.out.println();
			}
	 }
}
