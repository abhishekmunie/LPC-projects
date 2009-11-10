package lpcprojects.schoolprograms.OOP;

import java.io.*;

/**
 *
 * @author Abhishek
 */
public class Voter {

			int voterNo;
			int VoterID;
			String Name;
			String Address;
			int Age;

			public Voter(int voterNo, int VoterID, String Name, String Address, int Age) {
						this.voterNo = voterNo;
						this.VoterID = VoterID;
						this.Name = Name;
						this.Address = Address;
						this.Age = Age;
			}

			void display(int n) {
						System.out.println("Voter " + n + ":");
						System.out.println("Voter no.: " + voterNo);
						System.out.println("Voter ID: " + VoterID);
						System.out.println("Name: " + Name);
						System.out.println("Address: " + Address);
						System.out.println("Age: " + Age);
			}
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
			static Voter[] voters = new Voter[5];

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

			private static void input() throws IOException {
						for (int i = 0; i < voters.length; i++) {
									System.out.println("Voter " + (i + 1) + ":");
									System.out.print("Enter Voter no.: ");
									int voterNo = Integer.parseInt(BR.readLine());
									System.out.print("Enter Voter ID: ");
									int VoterID = Integer.parseInt(BR.readLine());
									System.out.print("Enter Name: ");
									String Name = BR.readLine();
									System.out.print("Enter Address: ");
									String Address = BR.readLine();
									System.out.print("Enter Age: ");
									int Age = Integer.parseInt(BR.readLine());
									voters[i] = new Voter(voterNo, VoterID, Name, Address, Age);
									System.out.println();
						}
			}

			private static void output() throws IOException {
						for (;;) {
									System.out.print("Enter the Voter no. who's Record you want to see: ");
									int n = Integer.parseInt(BR.readLine());
									if (n >= 0 && n < voters.length) {
												voters[n - 1].display(n);
												break;
									} else {
												System.out.println("Wrong choice");
												continue;
									}
						}
			}
}
