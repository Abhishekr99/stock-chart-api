package com.abhishek.stockchart.model;

import java.time.LocalDateTime;

import com.abhishek.stockchart.entity.Company;

public interface IpoModel {
	Double getPricePerShare();
	Long getNoOfShares();
	LocalDateTime getOpenDateTime();
	Company getCompany();
}
