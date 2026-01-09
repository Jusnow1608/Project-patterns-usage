package builder.business_plan;

public class BusinessPlanDirector {

    private final BusinessPlanBuilder builder;

    public BusinessPlanDirector(BusinessPlanBuilder builder) {
        this.builder = builder;
    }

    public BusinessPlan construct(boolean isUnregistered, boolean isVat) {
        builder.reset();
        builder.setBaseTasks();
        builder.addLegalSteps(isUnregistered);
        builder.addTaxSteps(isVat);
        return builder.getResult();
    }
}
