// src/main/java/com/backtesting/Strategy.java

package com.backtesting;

public interface Strategy {
    Trade evaluate(HistoricalPrice data, double currentCapital);
}