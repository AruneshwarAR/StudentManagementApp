package com.student.management;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> students = new ArrayList<>();
		while (true) {
			System.out.println("1. Add name");
			System.out.println("2. View names");
			System.out.println("3. Delete name");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("Enter the student");
				String name = sc.nextLine();
				students.add(name);
			} else if (choice == 2) {
				System.out.println("List of students "+students);

			}
			else if(choice == 3) {
				System.out.println("Enter name to delete:");
				String name = sc.nextLine();
				students.remove(students.indexOf(name));
			}
			else {
				System.out.println("Exiting");
				break;
			}
		}
		sc.close();
	}
}
