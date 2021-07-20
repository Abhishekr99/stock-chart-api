package com.abhishek.stockchart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.stockchart.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Long>
{
	public List<StockPrice> findByCompCode(String compCode);
}
