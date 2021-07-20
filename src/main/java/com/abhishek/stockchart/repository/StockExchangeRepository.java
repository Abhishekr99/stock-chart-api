package com.abhishek.stockchart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.stockchart.entity.StockExchange;

public interface StockExchangeRepository extends JpaRepository<StockExchange, Long>
{
	
}
