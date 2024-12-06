// src/main/java/com/backtesting/PerformanceComparison.java

package com.backtesting;

public class PerformanceComparison {

    public static void compareBacktestToActual(double backtestReturn, double actualReturn) {
        System.out.println("Backtest Return: " + backtestReturn + "%");
        System.out.println("Actual Return: " + actualReturn + "%");

        if (backtestReturn > actualReturn) {
            System.out.println("Backtest strategy outperformed the actual market.");
        } else if (backtestReturn < actualReturn) {
            System.out.println("Backtest strategy underperformed the actual market.");
        } else {
            System.out.println("Backtest strategy performed similarly to the actual market.");
        }
    }
}