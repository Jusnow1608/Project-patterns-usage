package factory;

public class Main {
    public static void main(String[] args) {

        String choice = "LEGAL";

        if (choice.equals("ACCOUNTING")) {
            AccountingService s = new AccountingService();
            s.startTaxConnection();
        } else if (choice.equals("LEGAL")) {
            LegalService s = new LegalService();
            s.assignLawyer();
        } else if (choice.equals("MARKETING")) {
            MarketingService s = new MarketingService();
            s.setupAds();
        }
    }
}
