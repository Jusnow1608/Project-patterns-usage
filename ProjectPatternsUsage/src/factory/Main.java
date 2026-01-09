package factory;

import factory.marketplace_service.MarketplaceService;
import factory.marketplace_service.MarketplaceServiceFactory;

public class Main {
    public static void main(String[] args) {

        String choice = "LEGAL";
        //String choice = "ACCOUNTING";
        System.out.println("=============== RESULTS =============");
        MarketplaceService service = MarketplaceServiceFactory.createService(choice);

        if (service != null) {
            service.execute();
        }
    }
}
