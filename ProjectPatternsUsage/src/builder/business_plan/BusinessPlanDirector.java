package builder.business_plan;

public class BusinessPlanDirector {

    private final BusinessPlanBuilder businessPlanBuilder;

    public BusinessPlanDirector(BusinessPlanBuilder businessPlanBuilder) {

        this.businessPlanBuilder = businessPlanBuilder;
    }

    public  BusinessPlan buildBusinessPlan(boolean isUnregistered, boolean isVat) {
        businessPlanBuilder.reset();
        businessPlanBuilder.setBaseTasks();
        businessPlanBuilder.addLegalSteps(isUnregistered);
        businessPlanBuilder.addTaxSteps(isVat);
        return businessPlanBuilder.getResult();
    }
}
