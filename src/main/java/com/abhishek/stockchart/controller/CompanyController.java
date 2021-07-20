package com.abhishek.stockchart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.stockchart.entity.Company;
import com.abhishek.stockchart.entity.StockExchange;
import com.abhishek.stockchart.model.CompExch;
import com.abhishek.stockchart.service.CompanyService;


@RestController
public class CompanyController 
{
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/company")
	public Company saveCompany(@RequestBody Company company/*CompExch compExch*/)
	{
		/*Company company = compExch.getCompany();
		String compCode = compExch.getCompCode();
		List<StockExchange> stockExchList = compExch.getStockExchList();
		
		company.addToCompExchList(stockExchList, compCode);*/
		return companyService.saveCompany(company);
	}
	
	@GetMapping("/company")
	public List<Company> getCompanyList()
	{
		return companyService.getCompanyList();
	}
	
	@GetMapping("/company/{name}")
	public Company getCompanyByName(@PathVariable("name") String name)
	{
		return companyService.getCompanyByName(name);
	}
	
	@PutMapping("/company/{id}")
	public Company updateCompany(@PathVariable("id") Long id,
								 @RequestBody Company company)
	{
		return companyService.updateCompany(id, company);
	}
}
