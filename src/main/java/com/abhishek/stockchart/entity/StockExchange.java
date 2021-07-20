package com.abhishek.stockchart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StockExchange 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long exchId;
	private String exchName;
	private String exchBrief;
	
	
	public long getExchId() {
		return exchId;
	}
	
	public String getExchName() {
		return exchName;
	}
	public void setExchName(String exchName) {
		this.exchName = exchName;
	}
	public String getExchBrief() {
		return exchBrief;
	}
	public void setExchBrief(String exchBrief) {
		this.exchBrief = exchBrief;
	}
	
	public StockExchange(long exchId, String exchName, String exchBrief) {
		super();
		this.exchId = exchId;
		this.exchName = exchName;
		this.exchBrief = exchBrief;
	}
	
	public StockExchange() {
		
	}
	@Override
	public String toString() {
		return "StockExchange [exchId=" + exchId + ", exchName=" + exchName + ", exchBrief=" + exchBrief + "]";
	}
	
	
//	@OneToMany(targetEntity = Companystockexchangemap.class)
//	private List<Companystockexchangemap> compstockmap;

}
