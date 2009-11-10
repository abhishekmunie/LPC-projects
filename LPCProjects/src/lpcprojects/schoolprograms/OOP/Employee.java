package lpcprojects.schoolprograms.OOP;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Employee {

			String Name;
			String Address;
			int Phoneno;
			float Salary;
			float netSalary;

			public Employee(String Name, String Address, int Phoneno, float Salary) {
						this.Name = Name;
						this.Address = Address;
						this.Phoneno = Phoneno;
						this.Salary = Salary;
						calcNetSalary();
			}

			void calcNetSalary() {
						float DA = 20f / 100 * Salary;
						float HRA = 25f / 100 * Salary;
						netSalary = DA + HRA + Salary;
			}

			void print() {
						System.out.println("Name: " + Name);
						System.out.println("Address: " + Address);
						System.out.println("Phone no.: " + Phoneno);
						System.out.println("Salary: " + Salary);
						System.out.println("Net Salary: " + netSalary);
			}
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
			static Employee[] employee;

			public static void main(String[] args) throws IOException {
						Outer:
						for (;;) {
									input();
									Outer2:
									for (;;) {
												System.out.print("Enter Employee no. to see its detail: ");
												int n = Integer.parseInt(BR.readLine());
												if (n > 0 || n <= employee.length) {
															employee[n - 1].print();
															for (;;) {
																		System.out.println("Do you want to continue?");
																		String ans = BR.readLine();
																		if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")) {
																					System.out.println("Do you whant to clear the existing data?");
																					String ans2 = BR.readLine();
																					System.out.println();
																					if (ans2.equalsIgnoreCase("y") || ans2.equalsIgnoreCase("yes")) {
																								continue Outer;
																					} else if (ans2.equalsIgnoreCase("n") || ans2.equalsIgnoreCase("no")) {
																								continue Outer2;
																					} else {
																								System.out.println("Wrong choice");
																								continue;
																					}
																		} else if (ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no")) {
																					System.out.println("Thank You!");
																					break Outer;
																		} else {
																					System.out.println("Wrong choice");
																					continue;
																		}
															}
												} else {
															System.out.println("Wrong Employee no.");
															continue;
												}
									}
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the number of Employee: ");
						employee = new Employee[Integer.parseInt(BR.readLine())];
						System.out.println();
						for (int i = 0; i < employee.length; i++) {
									System.out.println("EMPLOYEE " + (i + 1) + ":");
									System.out.print("Enter Name: ");
									String Name = BR.readLine();
									System.out.print("Enter Address: ");
									String Address = BR.readLine();
									System.out.print("Enter Phone no.: ");
									int Phoneno = Integer.parseInt(BR.readLine());
									System.out.print("Enter Salary: ");
									float Salary = Float.parseFloat(BR.readLine());
									employee[i] = new Employee(Name, Address, Phoneno, Salary);
									System.out.println();
						}
						System.out.println("Data in Records:");
						for (int i = 0; i < employee.length; i++) {
									System.out.println("EMPLOYEE " + (i + 1) + ":");
									employee[i].print();
									System.out.println();
						}
			}
}
