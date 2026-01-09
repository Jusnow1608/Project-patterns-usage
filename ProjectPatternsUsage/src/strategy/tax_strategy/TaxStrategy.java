package strategy.tax_strategy;

public interface TaxStrategy {

    double calculateTax(double revenue, double costs);
    String getName();
}
