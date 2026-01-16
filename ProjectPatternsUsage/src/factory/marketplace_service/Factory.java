package factory.marketplace_service;

public abstract class Factory {

    public abstract MarketplaceService createService();

    public void processOrder() {
        MarketplaceService service = createService();
        System.out.println("Preparing payment for service: " + service.getType());
        System.out.println("Payment validation...");
        service.execute();
        System.out.println("Subscription has been activated.\n");
    }
    }
