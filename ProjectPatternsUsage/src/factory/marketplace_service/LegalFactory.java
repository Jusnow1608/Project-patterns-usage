package factory.marketplace_service;

public class LegalFactory extends Factory{
    @Override
    public MarketplaceService createService() {
        return new LegalService();
    }
}
