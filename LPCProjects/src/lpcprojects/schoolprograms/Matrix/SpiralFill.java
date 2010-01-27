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
	 static int n;
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
			System.out.print("Enter the number of rows: ");
			int r = Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enter the number of columns: ");
			int c = Integer.parseInt(bufferedReader.readLine());
			Spiral = new int[r][c];
	 }

	 static void inputSpiral() throws IOException {
			int num = 1;
			for (int i = 0; i < Spiral.length; i++) {
				 for (int j = i; j < Spiral[i].length - i; j++) {
						Spiral[i][j] = num++;
				 }
				 for (int k = i + 1; k < Spiral.length - i; k++) {
						Spiral[k][Spiral[i].length - 1 - i] = num++;
				 }
				 for (int l = Spiral[Spiral.length - 1 - i].length - i - 2; l >= i; l--) {
						Spiral[Spiral.length - 1 - i][l] = num++;
				 }
				 for (int m = Spiral.length - i - 2; m > i; m--) {
						Spiral[m][i] = num++;
				 }
			}
	 }

	 static void display() {
			for (int i = 0; i < Spiral.length; i++) {
				 for (int j = 0; j < Spiral[i].length; j++) {
						System.out.print(Spiral[i][j] + "\t");
				 }
				 System.out.println();
			}
	 }
}
