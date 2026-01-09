package builder.business_plan;

import java.util.ArrayList;
import java.util.List;

public class BusinessPlan {
    private String persona;
    private final List<Task> tasks = new ArrayList<>();

    public BusinessPlan() {
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void display() {
        System.out.println("=== ASSISTANT STEP BY STEP: " + persona + " ===");
        tasks.forEach(System.out::println);
    }

        public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

}