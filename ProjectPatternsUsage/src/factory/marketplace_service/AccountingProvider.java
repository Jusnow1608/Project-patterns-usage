package factory.marketplace_service;

public class AccountingProvider implements MarketplaceService{

    private String planName = "Standard Accounting";

    @Override
    public void execute() {
        System.out.println("Connecting to tax office for: " + planName);
    }
}
