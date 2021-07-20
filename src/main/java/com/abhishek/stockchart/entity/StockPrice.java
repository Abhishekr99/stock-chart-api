package com.abhishek.stockchart.entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StockPrice 
{
	@Id
	@GeneratedValue
	private long id;
	private String exchName;
	private String compCode;
	//private LocalDateTime localdatetime;
	@ManyToOne(fetch = FetchType.LAZY)
	private Company company;
	private Date datee;
	private Time timee;
	private float sharePrice;

}
