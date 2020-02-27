import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoMain {
    public static class ToDoApplication {
        private static boolean option;
        private static boolean option2;

        public static void main(String[] args) {
            ToDoList tdl = new ToDoList();
            Scanner scanner = new Scanner(System.in);
            int action = 0;
            System.out.println("Welcome in To-Do Application, we will help you to plan your days");
            System.out.println("Please choose what would you like to do");
            System.out.println("1 - Add task to do \n2 - Print already added tasks\n3 - Remove task\n4 - Save to file list to do\n5 - Read from file list to-do\n6 - exit");


            while (option == false) {

                try {
                    action = scanner.nextInt();
                } catch (InputMismatchException IMS) {
                    System.out.println("Enter the number!");
                    break;
                }


                switch (action) {
                    case 1:
                        System.out.println("Type task to do");
                        String task = scanner.next();
                        tdl.addingTask(task);
                        System.out.println("You have successfully added task to do");
                        break;
                    case 2:
                        tdl.printingTaskList();
                        break;
                    case 3:
                        System.out.println("You have successfully removed task to do");
                        break;
                    case 4:
                        System.out.println("Your list have been saved");
                        break;
                    case 5:
                        System.out.println("Your list have been readed");
                    case 6:
                        option = true;
                    default:
                        System.out.println("There is no such option as " +
                                "it. Please choose one from above again.");
                }
            }
        }
    }
}
