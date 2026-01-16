package factory.marketplace_service;

public class MarketingFactory extends Factory{
    @Override
    public MarketplaceService createService() {
        return new MarketingService();
    }
}
