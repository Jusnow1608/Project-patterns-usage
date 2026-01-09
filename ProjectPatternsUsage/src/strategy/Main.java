package strategy;

public class Main {
    public static void main(String[] args) {
        ProfitabilityCalculator calculator = new ProfitabilityCalculator();

        // Sample data
        double monthlyRevenue = 15000.0;
        double monthlyCosts = 2500.0;

        System.out.println("=== STARTING PROFITABILITY CHECK ===");

        // Simulating user choosing Progressive Tax
        calculator.calculateAndDisplay(monthlyRevenue, monthlyCosts, "PROGRESSIVE");

        // Simulating user switching to Lump Sum to compare results
        calculator.calculateAndDisplay(monthlyRevenue, monthlyCosts, "LUMP_SUM");

        // Simulating user switching to Flat Tax
        calculator.calculateAndDisplay(monthlyRevenue, monthlyCosts, "FLAT_TAX");
    }
}
