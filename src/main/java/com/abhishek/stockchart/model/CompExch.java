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
	
	
	
}
