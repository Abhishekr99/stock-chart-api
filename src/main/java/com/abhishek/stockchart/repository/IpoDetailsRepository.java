package com.abhishek.stockchart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.IpoDetails;
import com.abhishek.stockchart.model.IpoModel;
import com.abhishek.stockchart.model.StockPriceModel;

@Repository
public interface IpoDetailsRepository extends JpaRepository<IpoDetails, Long>
{
	
}
