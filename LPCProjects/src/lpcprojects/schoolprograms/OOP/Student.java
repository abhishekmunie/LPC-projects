/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.OOP;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Student {

	int[] marks;
	double total;
	double percentage;
	char grade;

	public Student(int[] marks) {
		this.marks = marks;
		double total = 0;
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}
		this.total = total;
		this.percentage = total / (totalMark * marks.length) * 100d;
		if (percentage > 90 && percentage < 100) {
			grade = 'A';
		} else if (percentage > 75 && percentage < 90) {
			grade = 'B';
		} else if (percentage > 60 && percentage < 75) {
			grade = 'C';
		} else if (percentage > 50 && percentage < 60) {
			grade = 'D';
		} else if (percentage < 50) {
			grade = 'E';
		}
	}
	static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	static Student[] students;
	static double totalMark;

	public static void main(String[] args) throws IOException {
		Outer:
		for (;;) {
			input();
			Inner:
			for (;;) {
				output();
				for (;;) {
					System.out.println("Do you want to continue?");
					String ans = BR.readLine();
					if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")) {
						for (;;) {
							System.out.println("Do you whant to clear the existing data?");
							String ans2 = BR.readLine();
							if (ans2.equalsIgnoreCase("y") || ans2.equalsIgnoreCase("yes")) {
								continue Outer;
							} else if (ans2.equalsIgnoreCase("n") || ans2.equalsIgnoreCase("no")) {
								continue Inner;
							} else {
								System.out.println("Wrong choice");
								continue;
							}
						}
					} else if (ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no")) {
						break Outer;
					} else {
						System.out.println("Wrong choice");
						continue;
					}
				}
			}
		}
	}

	static void input() throws IOException {
		System.out.println("Enter the no. of Students:");
		students = new Student[Integer.parseInt(BR.readLine())];
		System.out.println("Enter the no. of Subjects:");
		int sub = Integer.parseInt(BR.readLine());
		System.out.println("Enter the Total Marks in each Subject:");
		totalMark = Double.parseDouble(BR.readLine());
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student " + (i + 1) + ":");
			int[] marks = new int[sub];
			for (int j = 0; j < marks.length; j++) {
				System.out.print("Marks in Subject " + (j + 1) + ": ");
				marks[j] = Integer.parseInt(BR.readLine());
			}
			students[i] = new Student(marks);
			System.out.println();
		}
	}

	static void output() {
		for (int i = 0; i < students.length; i++) {
			System.out.println("Grade for Student " + (i + 1) + ":\t" + students[i].grade);
		}
	}
}
