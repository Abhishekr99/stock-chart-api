package com.abhishek.stockchart.service;

import java.util.List;

import com.abhishek.stockchart.entity.StockExchange;

public interface StockExchangeService 
{
	public StockExchange saveStockExchange(StockExchange stkExch);

	public List<StockExchange> getStockExchangeList();
}
