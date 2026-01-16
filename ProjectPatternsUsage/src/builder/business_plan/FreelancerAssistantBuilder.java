package builder.business_plan;

public class FreelancerAssistantBuilder implements BusinessPlanBuilder{

    private BusinessPlan businessPlan;

    @Override
    public void reset() {
        businessPlan = new BusinessPlan();
        businessPlan.setBusinessType(BusinessType.FREELANCER);
    }

    @Override
    public void setBaseTasks() {
        businessPlan.addTask(new Task("Create Portfolio"));
    }

    @Override
    public void addLegalSteps(boolean isUnregistered) {
            if (isUnregistered) {
                businessPlan.addTask(new Task("Monitor Revenue Limit"));
            } else {
                businessPlan.addTask(new Task("Register in CEIDG"));
            }
    }

    @Override
    public void addTaxSteps(boolean isVatActive) {
            if (isVatActive) {
                businessPlan.addTask(new Task("VAT-R Registration"));
            }
    }

    @Override
    public BusinessPlan getResult() {
        return businessPlan;
    }
}
