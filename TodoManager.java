/**
 * 
 */
package assigment_02;

/**
 * @author: Mekonnen
 * @date  : Jan 18, 2023
 */
import java.util.Scanner;

public class TodoManager {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			String yourName;
			String taskOne, taskTwo, taskThree;
			int choice;
			System.out.print("Please, enter your name: ");
			yourName = input.nextLine();
			System.out.println("Greetings, " + yourName + "!");

			System.out.print("Please, enter your first task: ");
			taskOne = input.nextLine();
			System.out.print("Please, enter your second task: ");
			taskTwo = input.nextLine();
			System.out.print("Please, enter your third task: ");
			taskThree = input.nextLine();

			while (true) {
				System.out.println("1. Display tasks in increasing order: ");
				System.out.println("2. Display tasks in decreasing order: ");
				System.out.println("3. Checking for repeated tasks: ");
				System.out.println("0. Exit");
				System.out.print("Please enter your choice: ");
				choice = input.nextInt();
				input.nextLine();
				switch (choice) {
				// return tasks in increasing order based on String comparison result
				case 1:
					System.out.println("Display tasks in increasing order:");
					if (taskOne.compareTo(taskTwo) < 0 && taskOne.compareTo(taskThree) < 0) {
						System.out.println(taskOne);
						if (taskTwo.compareTo(taskThree) < 0) {
							System.out.println(taskTwo);
							System.out.println(taskThree);
						} else {
							System.out.println(taskThree);
							System.out.println(taskTwo);
						}
					} else if (taskTwo.compareTo(taskOne) < 0 && taskTwo.compareTo(taskThree) < 0) {
						System.out.println(taskTwo);
						if (taskOne.compareTo(taskThree) < 0) {
							System.out.println(taskOne);
							System.out.println(taskThree);
						} else {
							System.out.println(taskThree);
							System.out.println(taskOne);
						}
					} else {
						System.out.println(taskThree);
						if (taskOne.compareTo(taskTwo) < 0) {
							System.out.println(taskOne);
							System.out.println(taskTwo);
						} else {
							System.out.println(taskTwo);
							System.out.println(taskOne);
						}
					}
					break;
				// return tasks in decreasing order based on String comparison result
				case 2:
					System.out.println("Display tasks in decreasing order:");
					if (taskOne.compareTo(taskTwo) > 0 && taskOne.compareTo(taskThree) > 0) {
						System.out.println(taskOne);
						if (taskTwo.compareTo(taskThree) > 0) {
							System.out.println(taskTwo);
							System.out.println(taskThree);
						} else {
							System.out.println(taskThree);
							System.out.println(taskTwo);
						}
					} else if (taskTwo.compareTo(taskOne) > 0 && taskTwo.compareTo(taskThree) > 0) {
						System.out.println(taskTwo);
						if (taskOne.compareTo(taskThree) > 0) {
							System.out.println(taskOne);
							System.out.println(taskThree);
						} else {
							System.out.println(taskThree);
							System.out.println(taskOne);
						}
					} else {
						System.out.println(taskThree);
						if (taskOne.compareTo(taskTwo) > 0) {
							System.out.println(taskOne);
							System.out.println(taskTwo);
						} else {
							System.out.println(taskTwo);
							System.out.println(taskOne);
						}
					}
					break;
				// checks if there are repeated tasks
				case 3:
					if (taskOne.equals(taskTwo) || taskOne.equals(taskThree) || taskTwo.equals(taskThree)) {
						System.out.println("There are repeated tasks");
					} else {
						System.out.println("There are no repeated tasks");
					}
					break;
				case 0:
					System.out.println("Exiting the application");
					System.out.println("Thank you for using our daily task tracking app!");
					return;
				}

			}
		}
	}
}
