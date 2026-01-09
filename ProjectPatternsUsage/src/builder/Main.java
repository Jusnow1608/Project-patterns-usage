package builder;

import builder.business_plan.*;

public class Main {
    public static void main(String[] args) {

        // Test 1: Freelancer (Nierejestrowana)
        BusinessPlanDirector freelancerDirector = new BusinessPlanDirector(new FreelancerAssistantBuilder());
        BusinessPlan plan1 = freelancerDirector.construct(true, false);
        plan1.display();

        System.out.println();

        // Test 2: Sklep (Pełna działalność + VAT)
        BusinessPlanDirector shopDirector = new BusinessPlanDirector(new ShopAssistantBuilder());
        BusinessPlan plan2 = shopDirector.construct(false, true);
        plan2.display();
    }
}