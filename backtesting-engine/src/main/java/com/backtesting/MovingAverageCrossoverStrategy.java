// src/main/java/com/backtesting/MovingAverageCrossoverStrategy.java

package com.backtesting;

import java.util.List;

public class MovingAverageCrossoverStrategy implements Strategy {

    private int shortWindow;
    private int longWindow;

    public MovingAverageCrossoverStrategy(int shortWindow, int longWindow) {
        this.shortWindow = shortWindow;
        this.longWindow = longWindow;
    }

    @Override
    public Trade evaluate(HistoricalPrice data, double currentCapital) {
        // Logic to calculate short and long moving averages
        double shortMA = calculateMovingAverage(data, shortWindow);
        double longMA = calculateMovingAverage(data, longWindow);

        if (shortMA > longMA) {
            // Buy signal
            return new Trade("Buy", data.getClose(), currentCapital);
        } else if (shortMA < longMA) {
            // Sell signal
            return new Trade("Sell", data.getClose(), currentCapital);
        }
        return null;
    }

    // Function to calculate moving average
    private double calculateMovingAverage(List<HistoricalPrice> data, int window) {
        double sum = 0;
        for (int i = data.size() - window; i < data.size(); i++) {
            sum += data.get(i).getPrice();
        }
        return sum / window;
    }
}