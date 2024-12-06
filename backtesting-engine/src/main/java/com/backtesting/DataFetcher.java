package com.backtesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataFetcher {
    public List<Double> fetchHistoricalData(String symbol) throws IOException {
        // Example data (Replace with your API integration code)
        List<Double> priceData = new ArrayList<>();
        priceData.add(100.0); // Sample price data
        priceData.add(102.0);
        priceData.add(101.0);
        priceData.add(104.0);
        return priceData;
    }
}