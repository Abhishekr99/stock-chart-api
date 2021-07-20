package com.abhishek.stockchart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.CompExchMap;


@Repository
public interface CompExchMapRepository extends JpaRepository<CompExchMap, Long>{

}
