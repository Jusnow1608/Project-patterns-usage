package strategy;

import strategy.calculator.ProfitabilityCalculator;
import strategy.tax_strategy.FlatTaxStrategy;
import strategy.tax_strategy.LumpSumStrategy;
import strategy.tax_strategy.ProgressiveTaxStrategy;

public class Main {
    public static void main(String[] args) {
        ProfitabilityCalculator calculator = new ProfitabilityCalculator();

        System.out.println("--- STARTING PROFITABILITY CHECK ---");

        // Simulating user choosing Progressive Tax
        calculator.setStrategy(new ProgressiveTaxStrategy());
        calculator.runCalculation(1500, 2500);

        // Simulating user switching to Lump Sum to compare results
        calculator.setStrategy(new LumpSumStrategy());
        calculator.runCalculation(1500, 2500);

        // Simulating user switching to Flat Tax
        calculator.setStrategy(new FlatTaxStrategy());
        calculator.runCalculation(1500, 2500);
    }
}
