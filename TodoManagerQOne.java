/**
 * 
 */
package assigment_01;

/**
 * @author: Mekonnen
 * @date  : Jan 17, 2023
 */
import java.util.Arrays;
import java.util.Scanner;

public class TodoManagerQOne {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			Task[] tasks = {};
			int choice;
			while (true) {
			    System.out.println("*****Menu******");
			    System.out.println("1. Adding a new task");
			    System.out.println("2. Updating a new task");
			    System.out.println("3. Deleting a new Task");
			    System.out.println("4. Searching a new task");
			    System.out.println("0. Exit");
			    System.out.print("Please, enter your choice: ");
			    choice = input.nextInt();
			    switch (choice) {
			        case 1:
			            System.out.print("Please, enter the taskId, please: ");
			            int taskId = input.nextInt();
			            System.out.print("Please, enter the taskName, please: ");
			            String taskName = input.next();
			            Task[] newTasks = Arrays.copyOf(tasks, tasks.length + 1);
			            newTasks[newTasks.length - 1] = new Task(taskId, taskName);
			            tasks = newTasks;
			            break;
			        case 2:
			            System.out.print("Please, enter the taskId of the task you want to update: ");
			            taskId = input.nextInt();
			            int index = -1;
			            for (int i = 0; i < tasks.length; i++) {
			                if (tasks[i].getTaskId() == taskId) {
			                    index = i;
			                    break;
			                }
			            }

			            if (index == -1) {
			                System.out.println("Task was not found");
			            } else {
			                System.out.print("Please, nter the new taskName: ");
			                taskName = input.next();
			                tasks[index].setTaskName(taskName);
			            }
			            break;
			        case 3:
			            System.out.print("Please, enter the taskId of the task you want to delete: ");
			            taskId = input.nextInt();
			            index = -1;
			            for (int i = 0; i < tasks.length; i++) {
			                if (tasks[i].getTaskId() == taskId) {
			                    index = i;
			                    break;
			                }
			            }

			            if (index == -1) {
			                System.out.println("Task was not found");
			            } else {
			                Task[] newTasks1 = new Task[tasks.length - 1];
			                int j = 0;
			                for (int i = 0; i < tasks.length; i++) {
			                    if (i != index) {
			                        newTasks1[j] = tasks[i];
			                        j++;
			                    }
			                }
			                tasks = newTasks1;
			            }
			            break;
			        case 4:
			            System.out.print("Please, enter the taskId of the task you want to search: ");
			            taskId = input.nextInt();
			            index = -1;
			            for (int i = 0; i < tasks.length; i++) {
			                if (tasks[i].getTaskId() == taskId) {
			                    index = i;
			                    break;
			                }
			            }
			            if (index == -1) {
			                System.out.println("Task was not found");
			            } else {
			                System.out.println("Task found is: " + tasks[index].getTaskName());
			            }
			            break;
			        case 0:
			            System.out.println("Exiting the application");
			            System.out.println("Thank you for using our Menu task tracking app!");
			            return;
			    }
			    
			}
		}
    }
}


