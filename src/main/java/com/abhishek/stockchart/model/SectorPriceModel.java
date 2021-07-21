package com.abhishek.stockchart.model;

import java.sql.Date;
import java.time.LocalTime;

public interface SectorPriceModel 
{
	//Long getSectId();
	Long getSectPrice();
	String getSectName();
	Date getDatee();
	LocalTime getTimee();
}
