package factory;

public class AccountingService {
    private String planName = "Standard Accounting";

    public void startTaxConnection() {
        System.out.println("Connecting to tax office for: " + planName);
    }

}
