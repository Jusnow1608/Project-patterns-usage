package strategy.calculator;

import strategy.tax_strategy.TaxStrategy;

public class ProfitabilityCalculator {

    private TaxStrategy strategy;

        // Allows switching tax regimes at runtime (What-if analysis)
        public void setStrategy (TaxStrategy strategy){
            this.strategy = strategy;
        }

        public void runCalculation ( double revenue, double costs){
            if (strategy == null) {
                System.out.println("Error: Tax strategy not set!");
                return;
            }

            double tax = strategy.calculateTax(revenue, costs);
            double netProfit = (revenue - costs) - tax;

            System.out.println("--- Calculation for: "+ strategy.getName() + " ---");
            System.out.println("Revenue: " + revenue + " PLN");
            System.out.println("Costs: " + costs + " PLN");
            System.out.println("Calculated Tax: " + tax + " PLN");
            System.out.println("Net Profit: " + netProfit + " PLN");
            System.out.println("------------------------------------");
        }
    }

