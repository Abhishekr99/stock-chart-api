package com.abhishek.stockchart.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CompExchMap 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long compExchId;
	

	private String compCode;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "comp_id")
	private Company company;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "exch_id")
	private StockExchange stockExchange;

	public String getCompCode() {
		return compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}

	public long getCompExchId() {
		return compExchId;
	}

	public CompExchMap(String compCode, StockExchange stockExchange) {
		super();
		this.compCode = compCode;
		this.stockExchange = stockExchange;
	}
	
	public CompExchMap() {
		
	}

}
