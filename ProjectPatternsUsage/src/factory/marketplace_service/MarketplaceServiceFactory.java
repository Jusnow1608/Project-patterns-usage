package factory.marketplace_service;

public class MarketplaceServiceFactory {

    public static MarketplaceService createService(String type) {
        if (type == null) return null;

        return switch (type) {
            case "ACCOUNTING" -> new AccountingProvider();
            case "LEGAL" -> new LegalProvider();
            case "MARKETING" -> new MarketingProvider();
            default -> null;
        };
    }
}
