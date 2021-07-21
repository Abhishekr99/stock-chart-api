package com.abhishek.stockchart.repository;

import java.util.List;
import java.util.Objects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.Sector;
import com.abhishek.stockchart.model.SectorPriceModel;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long>
{
	public Sector findBySectName(String sectName);
	
	
}
