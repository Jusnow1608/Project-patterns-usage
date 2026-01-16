package factory.marketplace_service;

class MarketingService implements MarketplaceService {

    private int budget = 500;

    @Override
    public void execute() {
        System.out.println("Setting up ads with budget: " + budget);
    }

    @Override
    public ServiceType getType() {
        return ServiceType.MARKETING;
    }
}
