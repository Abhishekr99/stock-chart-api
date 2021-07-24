package com.abhishek.stockchart;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abhishek.stockchart.entity.Company;
import com.abhishek.stockchart.repository.CompanyRepository;

@SpringBootApplication
public class StockChartApplication {
	
	@Autowired
	private CompanyRepository companyRepository;

	public static void main(String[] args) {
		SpringApplication.run(StockChartApplication.class, args);
	}
	
	/*@PostConstruct
    private void postConstruct() {
		Company comp1 = new Company(1L,"ABC",100.0,"A","A,B,C","abc1");
		Company comp2 = new Company(2L,"DEF",200.0,"D","D,E,F","def1");
        companyRepository.save(comp1);
        companyRepository.save(comp2);
    }*/
}
