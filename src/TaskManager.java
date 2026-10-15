import java.util.Scanner;

class Task {

    // Private variables (Encapsulation)
    private String taskName;
    private Integer estimatedTime;
    private Boolean completed;

    // Setter methods
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    // Getter methods
    public String getTaskName() {
        return taskName;
    }

    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public Boolean getCompleted() {
        return completed;
    }
}

public class TaskManager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an array for 5 tasks
        Task[] tasks = new Task[5];

        System.out.println("DAILY TASK MANAGER");

        // Get information for 5 tasks
        for (int i = 0; i < 5; i++) {

            tasks[i] = new Task();

            System.out.println("\nTask " + (i + 1));

            System.out.print("Enter task name: ");
            String name = input.nextLine();
            tasks[i].setTaskName(name);

            System.out.print("Estimated time in minutes: ");
            Integer time = Integer.valueOf(input.nextLine());
            tasks[i].setEstimatedTime(time);

            System.out.print("Is task completed? (true/false): ");
            Boolean status = Boolean.valueOf(input.nextLine());
            tasks[i].setCompleted(status);
        }

        // Display all tasks
        System.out.println("\nYOUR DAILY TASKS");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nTask " + (i + 1));

            System.out.println("Name: " +
                    tasks[i].getTaskName());

            System.out.println("Estimated Time: " +
                    tasks[i].getEstimatedTime() + " minutes");

            System.out.println("Completed: " +
                    tasks[i].getCompleted());
        }

        input.close();
    }
}