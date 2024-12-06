package com.backtesting;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class YahooFinanceTest {
    public static void main(String[] args) {
        try {
            // Fetch stock data for Apple (AAPL)
            Stock apple = YahooFinance.get("AAPL");
            // Print the stock's name and its current price
            System.out.println("Stock: " + apple.getName());
            System.out.println("Price: " + apple.getQuote().getPrice());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}