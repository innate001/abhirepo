package com.backtesting;

import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            // Fetch Data
            DataFetcher dataFetcher = new DataFetcher();
            List<Double> priceData = dataFetcher.fetchHistoricalData("AAPL");

            // Define Strategy
            // Strategy strategy = new Strategy();
            Strategy strategy = new MovingAverageCrossoverStrategy(50, 200);
             // Example values for short and long windows
            boolean[] signals = strategy.movingAverageCrossover(priceData);

            // Run Backtest
            Backtest backtest = new Backtest(10000); // Starting with $10,000
            double finalCapital = backtest.runBacktest(priceData, signals);

            // Output Result
            System.out.println("Final Capital: $" + finalCapital);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}