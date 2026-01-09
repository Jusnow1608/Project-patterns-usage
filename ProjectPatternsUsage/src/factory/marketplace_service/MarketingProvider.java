package factory.marketplace_service;

public class MarketingProvider implements MarketplaceService {

    private int budget = 500;

    @Override
    public void execute() {
        System.out.println("Setting up ads with budget: " + budget);
    }
}
