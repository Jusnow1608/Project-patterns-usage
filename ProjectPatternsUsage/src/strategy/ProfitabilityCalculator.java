package strategy;

public class ProfitabilityCalculator {
    public void calculateAndDisplay(double revenue, double costs, String taxType) {
        double income = revenue - costs;
        double tax = 0;

        // PROBLEM: All calculation logic for different tax regimes is hardcoded here
        if (taxType.equals("LUMP_SUM")) {
            // Lump sum is calculated from revenue
            tax = revenue * 0.12;
        } else if (taxType.equals("FLAT_TAX")) {
            // Flat tax is 19% of income
            tax = (income > 0) ? income * 0.19 : 0;
        } else if (taxType.equals("PROGRESSIVE")) {
            // Progressive tax (12% up to 120k, then 32%)
            if (income <= 30000) {
                tax = 0;
            } else if (income <= 120000) {
                tax = (income * 0.12) - 3600;
            } else {
                tax = 10800 + ((income - 120000) * 0.32);
            }
        }

        double netProfit = income - tax;

        System.out.println("--- Calculation for: " + taxType + " ---");
        System.out.println("Revenue: " + revenue + " PLN");
        System.out.println("Costs: " + costs + " PLN");
        System.out.println("Calculated Tax: " + tax + " PLN");
        System.out.println("Net Profit: " + netProfit + " PLN");
        System.out.println("------------------------------------");
    }
}
