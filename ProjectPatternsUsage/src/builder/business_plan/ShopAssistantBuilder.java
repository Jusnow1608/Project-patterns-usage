package builder.business_plan;

public class ShopAssistantBuilder implements BusinessPlanBuilder{

    private BusinessPlan businessPlan;

    @Override
    public void reset() {
        businessPlan = new BusinessPlan();
        businessPlan.setBusinessType(BusinessType.SHOP);
    }

    @Override
    public void setBaseTasks() {
        businessPlan.addTask(new Task("Select E-commerce Platform"));
    }

    @Override
    public void addLegalSteps(boolean isUnregistered) {
        businessPlan.addTask(new Task("Register in CEIDG/KRS (Mandatory for Shop)"));
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
