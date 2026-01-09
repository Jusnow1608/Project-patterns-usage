package builder.business_plan;

public interface BusinessPlanBuilder {

    void reset();
    void setBaseTasks();
    void addLegalSteps(boolean isUnregistered);
    void addTaxSteps(boolean isVatActive);

    BusinessPlan getResult();
}
