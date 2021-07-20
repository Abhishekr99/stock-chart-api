package com.abhishek.stockchart.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>
{
	public Company findByCompName(String compName);
	public Company findByCompNameIgnoreCase(String compName);
}
