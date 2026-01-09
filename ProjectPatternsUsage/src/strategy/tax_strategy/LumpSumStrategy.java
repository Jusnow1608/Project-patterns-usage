package strategy.tax_strategy;

public class LumpSumStrategy implements TaxStrategy {

    @Override
    public double calculateTax(double revenue, double costs) {
        return revenue * 0.12;
    }

    @Override
    public String getName() {
        return "LUMP_SUM";
    }
}
