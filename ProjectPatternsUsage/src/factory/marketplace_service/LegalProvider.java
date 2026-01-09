package factory.marketplace_service;

public class LegalProvider implements MarketplaceService{

    private String lawyerType = "Business Specialist";

    @Override
    public void execute() {
        System.out.println("Assigning lawyer: " + lawyerType);
    }
}
