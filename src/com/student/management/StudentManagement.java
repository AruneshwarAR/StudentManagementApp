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
			System.out.println("4. Change name");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			String name = "";
			sc.nextLine();
			if (choice == 1) {
				System.out.println("Enter the student");
				name = sc.nextLine();
				students.add(name);
			} else if (choice == 2) {
				System.out.println("List of students "+students);

			}
			else if(choice == 3) {
				System.out.println("Enter name to delete:");
				name = sc.nextLine();
				if(students.contains(name)) {
				students.remove(name);System.out.println("Removed "+name);}
				else {
					System.out.println(name+" not found");
				}
			}
			else if(choice ==4) {
				System.out.println("Enter the name to be changed");
				name = sc.nextLine();
				System.out.println("Enter the changed name");
				String newName = sc.nextLine();
				int i = students.indexOf(name);
				students.set(i,newName);
				System.out.println("Name successfuly changed from "+name+" to "+students.get(i));
			}
			else {
				System.out.println("Exiting");
				break;
			}
		}
		sc.close();
	}
}
