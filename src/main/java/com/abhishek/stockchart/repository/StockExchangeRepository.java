package com.abhishek.stockchart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.StockExchange;
import com.abhishek.stockchart.model.StockExchangeModel;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Long>
{
	public StockExchange findByExchName(String exchName);
	
	@Query(
			value = "select e.exchId as exchId, e.exchName as exchName from StockExchange e"
			
	)
	List<StockExchangeModel> getAllExchangeNames();
}
