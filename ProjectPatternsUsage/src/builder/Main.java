package builder;

import builder.business_plan.*;

public class Main {
    public static void main(String[] args) {

        // Test 1: Freelancer (Nierejestrowana)
        BusinessPlanBuilder freelancerBusinessPlanBuilder = new FreelancerAssistantBuilder();
        BusinessPlanDirector freelancerBusinessPlanDirector = new BusinessPlanDirector(freelancerBusinessPlanBuilder);

        BusinessPlan freelancerBusinessPlan = freelancerBusinessPlanDirector.buildBusinessPlan(true, false);

        freelancerBusinessPlan.displayTasks();

        System.out.println();

        // Test 2: Sklep (Pełna działalność + VAT)
        BusinessPlanBuilder shopBusinessPlanBuilder = new ShopAssistantBuilder();
        BusinessPlanDirector shopBusinessPlanDirector = new BusinessPlanDirector(shopBusinessPlanBuilder);

        BusinessPlan shopBusinessPlan = shopBusinessPlanDirector.buildBusinessPlan(false, true);

        shopBusinessPlan.displayTasks();
    }
}