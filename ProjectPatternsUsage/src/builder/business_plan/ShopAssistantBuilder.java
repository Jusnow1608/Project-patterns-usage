package builder.business_plan;

public class ShopAssistantBuilder implements BusinessPlanBuilder{

    private BusinessPlan plan;

    @Override
    public void reset() {
        plan = new BusinessPlan();
        plan.setPersona("SHOP");
    }

    @Override
    public void setBaseTasks() {
        plan.addTask(new Task("Select E-commerce Platform"));
    }

    @Override
    public void addLegalSteps(boolean isUnregistered) {
        plan.addTask(new Task("Register in CEIDG/KRS (Mandatory for Shop)"));
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
