import java.util.ArrayList;

public class ToDoList {
    ArrayList list = new ArrayList();

    public void addingTask(String task) {
        list.add(task);
    }

    public void printingTaskList() {
        if (list.isEmpty() == true) {
            System.out.println("Your list is empty");
        } else {
            for (int i = 0; i <= list.size() - 1; i++) {
                System.out.println(list.get(i));
            }
        }
    }

}