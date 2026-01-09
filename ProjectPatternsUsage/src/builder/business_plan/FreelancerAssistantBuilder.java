package builder.business_plan;

public class FreelancerAssistantBuilder implements BusinessPlanBuilder{

    private BusinessPlan plan;

    @Override
    public void reset() {
        plan = new BusinessPlan();
        plan.setPersona("FREELANCER");
    }

    @Override
    public void setBaseTasks() {
            plan.addTask(new Task("Create Portfolio"));
    }

    @Override
    public void addLegalSteps(boolean isUnregistered) {
            if (isUnregistered) {
                plan.addTask(new Task("Monitor Revenue Limit"));
            } else {
                plan.addTask(new Task("Register in CEIDG"));
            }
    }

    @Override
    public void addTaxSteps(boolean isVatActive) {
            if (isVatActive) {
                plan.addTask(new Task("VAT-R Registration"));
            }
    }

    @Override
    public BusinessPlan getResult() {
        return plan;
    }
}
