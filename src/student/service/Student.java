package student.service;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String faculty;
	private int defaultPasswordLength = 8;
	private String universitySuffix = "uns";

	public Student(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.password = randomPassword(defaultPasswordLength);
		username = firstName.toLowerCase() + lastName.toLowerCase() + "." + universitySuffix;
		this.faculty = setFaculty();

	}

	private String setFaculty() {
		System.out.println("UNIVERSITY OF NOVI SAD\n\nNew student: " + firstName + " " + lastName + "\n\nFaculty Codes:"
				+ "\n1 Faculty of Philosophy" + "\n2 Faculty of Agriculture" + "\n3 Faculty of Law"
				+ "\n4 Faculty of Technology" + "\n5 Faculty of Economics" + "\n6 Faculty of Technical Sciences"
				+ "\n7 Faculty of Medicine" + "\n8 Faculty of Sciences" + "\n9 Academy of Arts"
				+ "\n10 Faculty of Civil Engeneering" + "\n11 Faculty of Sport and Physical Education"
				+ "\n\nEnter faculty code:");

		Scanner sc = new Scanner(System.in);
		int facultyChoice = sc.nextInt();

		if (facultyChoice == 1) {
			return "Faculty of Philosophy";
		} else if (facultyChoice == 2) {
			return "Faculty of Agriculture";
		} else if (facultyChoice == 3) {
			return "Faculty of Law";
		} else if (facultyChoice == 4) {
			return "Faculty of Technology";
		} else if (facultyChoice == 5) {
			return "Faculty of Economics";
		} else if (facultyChoice == 6) {
			return "Faculty of Technical Sciences";
		} else if (facultyChoice == 7) {
			return "Faculty of Medicine";
		} else if (facultyChoice == 8) {
			return "Faculty of Sciences";
		} else if (facultyChoice == 9) {
			return "Academy of Arts";
		} else if (facultyChoice == 10) {
			return "Faculty of Civil Engeneering";
		} else if (facultyChoice == 11) {
			return "Faculty of Sport and Physical Education";
		} else {
			return "";
		}
	}

	private String randomPassword(int length) {
		String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passSet.length());
			password[i] = passSet.charAt(rand);
		}
		return new String(password);
	}

	public void changePassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "Student: " + firstName + " " + lastName + "\nFaculty: " + faculty + "\n\nYour username is: " + username
				+ "\nYour pasword is: " + password;
	}

}
