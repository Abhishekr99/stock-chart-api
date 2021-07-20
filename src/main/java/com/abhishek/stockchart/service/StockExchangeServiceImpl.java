package com.abhishek.stockchart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhishek.stockchart.entity.StockExchange;
import com.abhishek.stockchart.repository.StockExchangeRepository;



public class StockExchangeServiceImpl implements StockExchangeService
{

	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	
	@Override
	public StockExchange saveStockExchange(StockExchange stkExch) {
		// TODO Auto-generated method stub
		return stockExchangeRepository.save(stkExch);
	}

	@Override
	public List<StockExchange> getStockExchangeList() {
		// TODO Auto-generated method stub
		return stockExchangeRepository.findAll();
	}
	
}
