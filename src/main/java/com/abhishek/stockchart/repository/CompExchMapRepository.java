package com.abhishek.stockchart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.CompExchMap;
import com.abhishek.stockchart.entity.StockPrice;
import com.abhishek.stockchart.model.CompanyModel;
import com.abhishek.stockchart.model.StockPriceModel;

@Repository
public interface CompExchMapRepository extends JpaRepository<CompExchMap, Long>
{
	@Query(
			value = "select c from CompExchMap c where c.company.compId = ?1 and c.stockExchange.exchId = ?2"
			
	)
	CompExchMap getCompanyExchangeMap(Long compId, Long exchId);
}
