package com.backtesting;

public class HistoricalPrice {
    private long timestamp;
    private double close;
    private double open;
    private double high;
    private double low;
    private long volume;

    public HistoricalPrice(long timestamp, double close, double open, double high, double low, long volume) {
        this.timestamp = timestamp;
        this.close = close;
        this.open = open;
        this.high = high;
        this.low = low;
        this.volume = volume;
    }

    // Getters
    public long getTimestamp() {
        return timestamp;
    }

    public double getClose() {
        return close;
    }

    public double getOpen() {
        return open;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public long getVolume() {
        return volume;
    }
}