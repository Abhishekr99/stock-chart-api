package com.abhishek.stockchart.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.stockchart.entity.CompExchMap;
import com.abhishek.stockchart.entity.Company;
import com.abhishek.stockchart.entity.Sector;
import com.abhishek.stockchart.entity.StockExchange;
import com.abhishek.stockchart.entity.StockPrice;
import com.abhishek.stockchart.model.CompExch;
import com.abhishek.stockchart.model.CompanySectorModel;
import com.abhishek.stockchart.repository.CompExchMapRepository;
import com.abhishek.stockchart.repository.CompanyRepository;
import com.abhishek.stockchart.repository.SectorRepository;
import com.abhishek.stockchart.repository.StockExchangeRepository;
import com.abhishek.stockchart.repository.StockPriceRepository;
import com.abhishek.stockchart.service.CompanyService;



@RestController
public class CompanyController 
{

	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	
	@Autowired
	private SectorRepository sectorRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private CompExchMapRepository compExchMapRepository;
	
	@PostMapping("/company")
	public Company saveCompany(@RequestBody /*Company company*/CompanySectorModel companySectorModel)
	{		
		Company company = companySectorModel.getCompany();
		Sector sector = companySectorModel.getSector();
		Sector existingSector = sectorRepository.findBySectName(sector.getSectName());
		if(Objects.isNull(existingSector))
		{
			Sector newSector = sectorRepository.save(sector);
			company.setSector(newSector);
		}
		else {
			company.setSector(existingSector);
		}
		Company responseCompany = companyService.saveCompany(company);		
		return responseCompany;	
		
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
	
	
	
	
	
	@PostMapping("/compExch")
	public CompExchMap saveCompExch(@RequestBody CompExch compExch)
	{
		Company company = companyRepository.findById(compExch.getCompId()).get();
		StockExchange stockExchange = stockExchangeRepository.findById(compExch.getExchId()).get();
		
		CompExchMap compExchMap = new CompExchMap();
		compExchMap.setCompany(company);
		compExchMap.setStockExchange(stockExchange);
		compExchMap.setCompCode(compExch.getCompCode());
		
		return compExchMapRepository.save(compExchMap);
	}
	
	@GetMapping("/compExch")
	public List<CompExchMap> getCompExch()
	{
		return compExchMapRepository.findAll();
	}
}
