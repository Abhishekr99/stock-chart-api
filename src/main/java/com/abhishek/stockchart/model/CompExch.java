package com.abhishek.stockchart.model;

import java.util.List;

import com.abhishek.stockchart.entity.Company;
import com.abhishek.stockchart.entity.StockExchange;

public class CompExch 
{
	private Company company;
	private String compCode;
	private List<StockExchange> stockExchList;
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getCompCode() {
		return compCode;
	}
	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}
	public List<StockExchange> getStockExchList() {
		return stockExchList;
	}
	public void setStockExchList(List<StockExchange> stockExchList) {
		this.stockExchList = stockExchList;
	}
	
}
