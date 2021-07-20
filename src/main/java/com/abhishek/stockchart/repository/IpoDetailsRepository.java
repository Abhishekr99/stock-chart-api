package com.abhishek.stockchart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.IpoDetails;

@Repository
public interface IpoDetailsRepository extends JpaRepository<IpoDetails, Long>
{
	
}
