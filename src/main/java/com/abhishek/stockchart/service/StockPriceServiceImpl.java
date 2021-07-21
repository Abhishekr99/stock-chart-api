package com.abhishek.stockchart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhishek.stockchart.entity.StockPrice;
import com.abhishek.stockchart.model.StockPriceModel;
import com.abhishek.stockchart.repository.CompExchMapRepository;
import com.abhishek.stockchart.repository.StockPriceRepository;

public class StockPriceServiceImpl implements StockPriceService
{
	@Autowired
	private CompExchMapRepository compExchMapRepository;
	@Autowired
	private StockPriceRepository stockPriceRepository;
	
	@Override
	public List<StockPriceModel> getStockByCompanyId(Long compId) {
		// TODO Auto-generated method stub
		return stockPriceRepository.getStockByCompanyId(compId);
	}
	
}
