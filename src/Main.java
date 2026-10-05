import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        // create list of our tasks
        ArrayList<Task> tasks = new ArrayList<>();

        // create scanner for reading
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        System.out.println("=== Java CLI Task Tracker ===");

        // while loop
        while (running) 
        {
            System.out.println("\n1. Add Task | 2. View Tasks | 3. Complete Task | 4. Exit");

            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            scanner.nextLine();

            switch (option)
            {
                case 1: 
                {
                    System.out.print("Enter a task description: ");
                    String tittle = scanner.nextLine();
                    tasks.add(new Task(tittle));
                    System.out.println("Task added!");
                    break;
                } // case 1

                case 2: 
                {
                    System.out.println("\n  -> Your Tasks <- ");
                    if (tasks.isEmpty()) 
                    {
                        System.out.println("No tasks yet.");
                    } 
                    else
                    {
                        for (int i = 0; i < tasks.size(); i++)
                        {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                } // case 2 

                case 3:
                {
                    System.out.println("Enter task number to mark as done:");
                    
                    int index = scanner.nextInt() - 1;

                    if (index >= 0 && index < tasks.size())
                    {
                        tasks.get(index).markAsDone();
                        System.out.println("Task completed!");
                    } 
                    else
                    {
                        System.out.println("Invalid number of task!");
                    }   
                    break;
                } // case 3

                case 4: 
                {
                    running = false;
                    System.out.println("GoodBye!");
                    break;
                } // case 4 

                default:
                    System.out.println("Invalid option!");
                    break;
            } // switch
        
        } // while loop
    
        scanner.close();
    } // void main 

} // main