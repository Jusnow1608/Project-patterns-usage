package strategy.tax_strategy;

public class ProgressiveTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double revenue, double costs) {

        double income = revenue - costs;

        if (income <= 30000)
            return 0;
        if (income <= 120000)
            return (income * 0.12) - 3600;
        return 10800 + ((income - 120000) * 0.32);
    }

    @Override
    public String getName() {
        return "PROGRESSIVE";
    }
}
