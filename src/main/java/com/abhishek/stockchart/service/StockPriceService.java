package com.abhishek.stockchart.service;

import java.util.List;

import com.abhishek.stockchart.entity.StockPrice;
import com.abhishek.stockchart.model.StockPriceModel;

public interface StockPriceService 
{
	public List<StockPriceModel> getStockByCompanyId(Long compId);
}
