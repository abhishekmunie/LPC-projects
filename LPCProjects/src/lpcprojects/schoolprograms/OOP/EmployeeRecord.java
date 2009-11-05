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
public class EmployeeRecord {

	int EmployeeNo;
	String Name;
	String Designation;
	String Address;
	String House;
	String Area;
	String City;
	String State;
	float basicPay;

	public EmployeeRecord(int EmployeeNo, String Name, String Designation, String Address, String House, String Area, String City, String State, float basicPay) {
		this.EmployeeNo = EmployeeNo;
		this.Name = Name;
		this.Designation = Designation;
		this.Address = Address;
		this.House = House;
		this.Area = Area;
		this.City = City;
		this.State = State;
		this.basicPay = basicPay;
	}

	void print() {
		System.out.println("Employee No.: " + EmployeeNo);
		System.out.println("Name: " + Name);
		System.out.println("Designation: " + Designation);
		System.out.println("Address: " + Address);
		System.out.println("House: " + House);
		System.out.println("Area: " + Area);
		System.out.println("City: " + City);
		System.out.println("State: " + State);
		System.out.println("Basic Pay: " + basicPay);
	}
	static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	static EmployeeRecord[] employeeRecord;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		Outer:
		for (;;) {
			input();
			Outer2:
			for (;;) {
				output();
				for (;;) {
					System.out.println("Do you whant to continue?");
					String ans = BR.readLine();
					if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")) {
						System.out.println("Do you whant to clear the existing data?");
						String ans2 = BR.readLine();
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
			}
		}
	}

	static void input() throws IOException {
		System.out.println("Enter the number of Employee");
		employeeRecord = new EmployeeRecord[Integer.parseInt(BR.readLine())];
		for (int i = 0; i < employeeRecord.length; i++) {
			System.out.println("EMPLOYEE " + (i + 1) + ":");
			System.out.print("Enter Employee no.: ");
			int EmployeeNo = Integer.parseInt(BR.readLine());
			System.out.print("Enter Name: ");
			String Name = BR.readLine();
			System.out.print("Enter Designation: ");
			String Designation = BR.readLine();
			System.out.print("Enter Address: ");
			String Address = BR.readLine();
			System.out.print("Enter House: ");
			String House = BR.readLine();
			System.out.print("Enter Area: ");
			String Area = BR.readLine();
			System.out.print("Enter City: ");
			String City = BR.readLine();
			System.out.print("Enter State: ");
			String State = BR.readLine();
			System.out.print("Enter Basic Pay: ");
			float basicPay = Float.parseFloat(BR.readLine());
			employeeRecord[i] = new EmployeeRecord(EmployeeNo, Name, Designation, Address, House, Area, City, State, basicPay);
			System.out.println();
		}
	}

	static void output() throws IOException {
		for (;;) {
			System.out.println("Enter Employee no. to see its detail");
			int n = Integer.parseInt(BR.readLine());
			int pos;
			if ((pos = search(n)) >= 0) {
				employeeRecord[pos].print();
				break;
			} else {
				System.out.println("Wrong Employee no.");
				continue;
			}
		}
	}

	static int search(int s) {
		int pos = -1;
		for (int i = 0; i < employeeRecord.length; i++) {
			if (employeeRecord[i].EmployeeNo == s) {
				pos = i;
				break;
			}
		}
		return pos;
	}
}
