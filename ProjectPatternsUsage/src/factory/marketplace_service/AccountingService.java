package factory.marketplace_service;

class AccountingService implements MarketplaceService{

    private String planName = "Standard Accounting";

    @Override
    public void execute() {
        System.out.println("Connecting to tax office for: " + planName);
    }

    @Override
    public ServiceType getType() {
        return ServiceType.ACCOUNTING;
    }
}
