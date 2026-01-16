package factory.marketplace_service;

class LegalService implements MarketplaceService{

    private String lawyerType = "Business Specialist";

    @Override
    public void execute() {
        System.out.println("Assigning lawyer: " + lawyerType);
    }

    @Override
    public ServiceType getType() {
        return ServiceType.LEGAL;
    }
}
