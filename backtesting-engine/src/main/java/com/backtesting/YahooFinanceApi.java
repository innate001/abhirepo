package com.backtesting;

import yahoofinance.YahooFinance;
import yahoofinance.Stock;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.HistoricalQuoteRequest;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class YahooFinanceApi {

    // Fetch historical data for a specific stock ticker and time period
    public static List<HistoricalPrice> fetchHistoricalData(String ticker, Calendar startDate, Calendar endDate) throws IOException {
        // Get the stock from Yahoo Finance
        Stock stock = YahooFinance.get(ticker);
        
        // Get historical data for the given time range
        List<HistoricalQuote> quotes = stock.getHistory(startDate, endDate);
        
        List<HistoricalPrice> historicalPrices = new ArrayList<>();
        
        // Loop through quotes and extract relevant data (Date, Open, Close, High, Low, Volume)
        for (HistoricalQuote quote : quotes) {
            HistoricalPrice historicalPrice = new HistoricalPrice(
                quote.getDate().getTime(),  // Convert the date to timestamp
                quote.getClose().doubleValue(),  // Closing price
                quote.getOpen().doubleValue(),  // Opening price
                quote.getHigh().doubleValue(),  // High price
                quote.getLow().doubleValue(),   // Low price
                quote.getVolume().longValue()   // Volume
            );
            historicalPrices.add(historicalPrice);
        }
        
        return historicalPrices;
    }
}