// src/main/java/com/backtesting/Backtest.java

package com.backtesting;

import java.util.ArrayList;
import java.util.List;

public class Backtest {

    private double initialCapital;
    private List<Trade> trades;  // Stores all trades made during backtesting

    public Backtest(double initialCapital) {
        this.initialCapital = initialCapital;
        this.trades = new ArrayList<>();
    }

    // Function to simulate trading based on strategy and historical data
    public void runBacktest(List<HistoricalPrice> historicalData, Strategy strategy) {
        double capital = initialCapital;
        for (HistoricalPrice data : historicalData) {
            // Apply strategy to each historical price to make buy/sell decisions
            Trade trade = strategy.evaluate(data, capital);
            if (trade != null) {
                trades.add(trade);
                capital = trade.updateCapital(capital); // Update capital after each trade
            }
        }
        evaluatePerformance();
    }

    // Function to evaluate performance
    public void evaluatePerformance() {
        double finalCapital = initialCapital;
        for (Trade trade : trades) {
            finalCapital = trade.updateCapital(finalCapital);
        }

        double totalReturn = (finalCapital - initialCapital) / initialCapital * 100;
        System.out.println("Total Return from Backtest: " + totalReturn + "%");
    }
}