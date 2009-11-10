package lpcprojects.schoolprograms.OOP;

import java.io.*;

/**
 * @author Abhishek
 */
public class StudentData {

			int SchoolCode;
			String DateOfBirth;
			int[] LastExamMarks;
			double Percentage;
			String FatherName;

			public StudentData(int SchoolCode, String DateOfBirth, int[] LastExamMarks, String FatherName) {
						this.SchoolCode = SchoolCode;
						this.DateOfBirth = DateOfBirth;
						this.LastExamMarks = LastExamMarks;
						double total = 0;
						for (int i = 0; i < LastExamMarks.length; i++)
									total += LastExamMarks[i];
						this.Percentage = total / (totalMark * LastExamMarks.length) * 100d;
						this.FatherName = FatherName;
			}

			void display(int n) {
						System.out.println("Student " + n + ":");
						System.out.println("School Code: " + SchoolCode);
						System.out.println("Father's Name: " + FatherName);
						System.out.println("Date of Birth: " + DateOfBirth);
						System.out.println("Last Exam Marks:");
						for (int i = 0; i < LastExamMarks.length; i++)
									System.out.println("Marks in Subject " + (i + 1) + ": " + LastExamMarks[i]);
						System.out.println("Percentage: " + Percentage);
			}
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
			static StudentData[] studentsData;
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
																					System.out.println("Do you want to clear the existing data?");
																					String ans2 = BR.readLine();
																					if (ans2.equalsIgnoreCase("y") || ans2.equalsIgnoreCase("yes"))
																								continue Outer;
																					else if (ans2.equalsIgnoreCase("n") || ans2.equalsIgnoreCase("no"))
																								continue Inner;
																					else {
																								System.out.println("Wrong choice");
																								continue;
																					}
																		}
															} else if (ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no")) {
																		break Outer;
															} else
																		System.out.println("Wrong choice");
												}
									}
						}
			}

			static void input() throws IOException {
						System.out.println("Enter the no. of Students:");
						studentsData = new StudentData[Integer.parseInt(BR.readLine())];
						System.out.println();
						System.out.println("Enter the no. of Subjects:");
						int sub = Integer.parseInt(BR.readLine());
						System.out.println();
						System.out.println("Enter the Total Marks in each Subject:");
						totalMark = Double.parseDouble(BR.readLine());
						System.out.println();
						for (int i = 0; i < studentsData.length; i++) {
									System.out.println("Student " + (i + 1) + ":");
									System.out.print("Enter School Code: ");
									int SchoolCode = Integer.parseInt(BR.readLine());
									System.out.print("Enter Father's Name: ");
									String FatherName = BR.readLine();
									System.out.print("Enter Date of Birth: ");
									String DateOfBirth = BR.readLine();
									System.out.println("Enter Last Exam Mark:");
									int[] LastExamMarks = new int[sub];
									for (int j = 0; j < LastExamMarks.length; j++) {
												System.out.print("Marks in Subject " + (j + 1) + ": ");
												LastExamMarks[j] = Integer.parseInt(BR.readLine());
									}
									System.out.println();
									studentsData[i] = new StudentData(SchoolCode, DateOfBirth, LastExamMarks, FatherName);
						}
			}

			static void output() throws IOException {
						for (;;) {
									System.out.print("Enter the Student no. whose data you want to see: ");
									int n = Integer.parseInt(BR.readLine());
									if (n >= 0 && n < studentsData.length) {
												studentsData[n - 1].display(n);
												break;
									} else {
												System.out.println("Wrong Choice.");
												continue;
									}
						}
			}
}

	