package lpcprojects.schoolprograms.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Abhishek
 */
public class Deletion {

	 static int[] ARR;
	 static int COUNT, SIZE, POS;
	 static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

	 /**
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			enterArray();
			delete();
			display();
	 }

	 static void enterArray() throws IOException {
			System.out.print("Enter the size of Array: ");
			SIZE = Integer.parseInt(BR.readLine());
			System.out.println("Enter the elements of Array: ");
			ARR = new int[SIZE];
			for (int i = 0; i < SIZE; i++) {
				 ARR[i] = Integer.parseInt(BR.readLine());
			}
	 }

	 static void input() throws IOException {
			System.out.print("Enter the Position: ");
			POS = Integer.parseInt(BR.readLine()) - 1;
	 }

	 static void delete() throws IOException {
			input();
			COUNT = POS;
			while (COUNT < (SIZE - 1)) {
				 ARR[COUNT] = ARR[COUNT + 1];
				 COUNT++;
			}
			ARR[SIZE - 1] = 0;
	 }

	 static void display() {
			for (int i = 0; i < (ARR.length - 1); i++) {
				 System.out.print(ARR[i]);
				 if (i < (ARR.length - 2)) {
						System.out.print(", ");
				 }
			}
			System.out.println();
	 }
}
