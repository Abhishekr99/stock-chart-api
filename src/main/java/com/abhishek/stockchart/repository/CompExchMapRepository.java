package com.abhishek.stockchart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.stockchart.entity.CompExchMap;

public interface CompExchMapRepository extends JpaRepository<CompExchMap, Long>
{
	
}
