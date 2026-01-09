package strategy.tax_strategy;

public class FlatTaxStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double revenue, double costs) {
        double income = revenue - costs;
        return (income > 0) ? income * 0.19 : 0;
    }

    @Override
    public String getName() {
        return "FLAT_TAX";
    }
}
