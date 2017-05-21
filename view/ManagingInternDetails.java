package view;

import java.io.IOException;
import java.util.Scanner;

import model.ContactHolder;

import controller.handler;

public class ManagingInternDetails {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ContactHolder holder = new ContactHolder();

		handler handler = new handler();

		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.println("Select an option:");

			System.out.println("1.Add a new Intern");

			System.out.println("2.Show the list of Interns");

			System.out.println("3.Search a particular Intern");

			System.out.println("4.Delete one Intern");

			System.out.println("5.Delete all Interns");
			int choice = in.nextInt();

			switch (choice) {

			case 1:
				handler.addIntern(holder);

				break;
			case 2:

				handler.showIntern(holder);

				break;
			case 3:
				handler.searchIntern(holder);
				break;

			case 4:
				handler.deleteOneIntern(holder);
				break;

			case 5:
				handler.deleteAllIntern(holder);
				break;

			default:

				System.out.println("Invalid input");

			}

		}
	}
}