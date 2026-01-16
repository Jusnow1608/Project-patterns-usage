package builder.business_plan;

import java.util.ArrayList;
import java.util.List;

public class BusinessPlan {
    private BusinessType type;
    private final List<Task> tasks = new ArrayList<>();
    // Konstruktor domyślny - widoczny tylko w tym pakiecie!
    BusinessPlan() {}

    public void addTask(Task task) {

        this.tasks.add(task);
    }

    public void displayTasks() {
        System.out.println("=== ASSISTANT STEP BY STEP: " + type + " ===");
        tasks.forEach(System.out::println);
    }

    public void setBusinessType(BusinessType type) {
        this.type = type;
    }

}