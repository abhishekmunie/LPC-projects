/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcprojects.schoolprograms.fileHandling;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Teacher {

	 static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 public String name;
	 public String address;
	 public float basic;
	 public int phoneNo;
	 public String gender;
	 public String qualification;
	 public float totalSalary;

	 public Teacher() throws IOException {
			System.out.println("Enter Name: ");
			name = bufferedReader.readLine();
			System.out.println("Enter Address: ");
			address = bufferedReader.readLine();
			System.out.println("Enter basic: ");
			basic = Float.parseFloat(bufferedReader.readLine());
			System.out.println("Enter phone no: ");
			phoneNo = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter gender : ");
			gender = bufferedReader.readLine();
			System.out.println("Enter qualification: ");
			qualification = bufferedReader.readLine();
			calcTotalSalary();
	 }

	 public Teacher(String name, String address, float basic, int phoneNo, String gender, String qualification) {
			this.name = name;
			this.address = address;
			this.basic = basic;
			this.phoneNo = phoneNo;
			this.gender = gender;
			this.qualification = qualification;
			calcTotalSalary();
	 }

	 public Teacher(String file) throws IOException {
			BufferedReader br = new BufferedReader(new FileReader(file));
			name = br.readLine();
			address = br.readLine();
			basic = Float.parseFloat(br.readLine());
			phoneNo = Integer.parseInt(br.readLine());
			gender = br.readLine();
			qualification = br.readLine();
			calcTotalSalary();
			br.close();
	 }

	 public void calcTotalSalary() {
			float da = basic * 0.03f;
			float hra = basic * 0.02f;
			totalSalary = basic + da + hra;
	 }

	 public void display() {
			System.out.println("Name is " + name);
			System.out.println("Address is " + address);
			System.out.println("Basic Address is " + basic);
			System.out.println("phone no is " + phoneNo);
			System.out.println("Gender is " + gender);
			System.out.println("Qualification is " + qualification);
			System.out.println("Total salary is " + totalSalary);
	 }

	 public void store(String file) throws IOException {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			pw.println(name);
			pw.println(address);
			pw.println(basic);
			pw.println(phoneNo);
			pw.println(gender);
			pw.println(qualification);
			pw.close();
	 }
	 static Teacher[] teachers;

	 /**
	  * Main Method
	  * @param args the command line arguments
	  * @throws IOException
	  */
	 public static void main(String[] args) throws IOException {
			System.out.print("Enter the number of teacher: ");
			teachers = new Teacher[Integer.parseInt(bufferedReader.readLine())];
			for (int i = 0; i < teachers.length; i++) {
				 teachers[i] = new Teacher();
				 System.out.println("Class: " + teachers[i]);
				 teachers[i].store(Integer.toString(i) + ".txt");
			}
			teachers = new Teacher[teachers.length];
			for (int i = 0; i < teachers.length; i++) {
				 teachers[i] = new Teacher(Integer.toString(i) + ".txt");
			}
			System.out.println("Enter the teacher no. whose detail you want to see: ");
			teachers[Integer.parseInt(bufferedReader.readLine())].display();
	 }
}
