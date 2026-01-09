package strategy;

import strategy.calculator.ProfitabilityCalculator;
import strategy.tax_strategy.FlatTaxStrategy;
import strategy.tax_strategy.LumpSumStrategy;
import strategy.tax_strategy.ProgressiveTaxStrategy;

public class Main {
    public static void main(String[] args) {
        ProfitabilityCalculator calculator = new ProfitabilityCalculator();

        // Sample data
        double monthlyRevenue = 15000.0;
        double monthlyCosts = 2500.0;

        System.out.println("=== STARTING PROFITABILITY CHECK ===");

        // Simulating user choosing Progressive Tax
        calculator.setStrategy(new ProgressiveTaxStrategy());
        calculator.runCalculation(monthlyRevenue, monthlyCosts);

        // Simulating user switching to Lump Sum to compare results
        calculator.setStrategy(new LumpSumStrategy());
        calculator.runCalculation(monthlyRevenue, monthlyCosts);

        // Simulating user switching to Flat Tax
        calculator.setStrategy(new FlatTaxStrategy());
        calculator.runCalculation(monthlyRevenue, monthlyCosts);
    }
}
