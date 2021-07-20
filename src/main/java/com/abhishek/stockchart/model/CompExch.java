package com.abhishek.stockchart.model;

import java.util.List;

import javax.persistence.Entity;

import com.abhishek.stockchart.entity.Company;
import com.abhishek.stockchart.entity.StockExchange;

public class CompExch 
{
	private Long compId;
	private Long exchId;
	private String compCode;
	public Long getCompId() {
		return compId;
	}
	public void setCompId(Long compId) {
		this.compId = compId;
	}
	public Long getExchId() {
		return exchId;
	}
	public void setExchId(Long exchId) {
		this.exchId = exchId;
	}
	public String getCompCode() {
		return compCode;
	}
	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}
	
	
	/*private Company company;
	private String compCode;
	private List<StockExchange> stockExchList;
	
	
	public CompExch(Company company, String compCode, List<StockExchange> stockExchList) {
		super();
		this.company = company;
		this.compCode = compCode;
		this.stockExchList = stockExchList;
	}
	public CompExch() {
		
	}
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
	@Override
	public String toString() {
		return "CompExch [company=" + company + ", compCode=" + compCode + ", stockExchList=" + stockExchList + "]";
	}
	*/
}
