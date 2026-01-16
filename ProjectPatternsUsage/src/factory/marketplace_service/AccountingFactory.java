package factory.marketplace_service;

public class AccountingFactory extends Factory{
    @Override
    public MarketplaceService createService() {
        return new AccountingService();
    }
}
