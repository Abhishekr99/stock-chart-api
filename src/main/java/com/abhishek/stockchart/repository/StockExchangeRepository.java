package com.abhishek.stockchart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Long>
{
	public StockExchange findByExchName(String exchName);
}
