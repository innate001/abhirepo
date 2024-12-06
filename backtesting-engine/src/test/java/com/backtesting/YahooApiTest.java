package com.backtesting;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class YahooApiTest {
    public static void main(String[] args) {
        try {
            // Fetch stock data for a ticker symbol (e.g., AAPL)
            Stock stock = YahooFinance.get("AAPL");
            
            // Print stock details
            System.out.println("Symbol: " + stock.getSymbol());
            System.out.println("Price: " + stock.getQuote().getPrice());
            System.out.println("Currency: " + stock.getCurrency());
            System.out.println("Stock Exchange: " + stock.getStockExchange());
        } catch (Exception e) {
            System.out.println("Error fetching data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}