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
import com.abhishek.stockchart.entity.StockExchange;
import com.abhishek.stockchart.entity.StockPrice;
import com.abhishek.stockchart.model.CompExch;
import com.abhishek.stockchart.repository.CompExchMapRepository;
import com.abhishek.stockchart.repository.CompanyRepository;
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
	private StockPriceRepository stockPriceRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private CompExchMapRepository compExchMapRepository;
	
	@PostMapping("/company")
	public Company saveCompany(@RequestBody Company company)
	{
//		Company company = compExch.getCompany();
//		System.out.println("Compyy: "+company);
//		String compCode = compExch.getCompCode();
//		System.out.println("codiy: "+compCode);
//		List<StockExchange> stockExchList = compExch.getStockExchList();
//		System.out.println("listyy: "+stockExchList);
//		
//		if(stockExchList != null)
//		{
//			stockExchangeRepository.saveAll(stockExchList);
//			//company.addToCompExchList(stockExchList, compCode);
//			company.addStockExcahnges(stockExchList);
//		}
		
		Company responseCompany = companyService.saveCompany(company);
		
		
		return responseCompany;
		
		//return company;
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
	
	@PostMapping("/stock/{compId}")
	public StockPrice saveStocks(@PathVariable("compId") Long id, @RequestBody StockPrice stockPrice)
	{
		stockPrice.setCompany(companyRepository.findById(id).get());
		return stockPriceRepository.save(stockPrice);
	}
	
	@GetMapping("/stock/{compCode}")
	public List<StockPrice> getStocks(@PathVariable("compCode") String compCode)
	{
		return stockPriceRepository.findByCompCode(compCode);
	}
	
	@PostMapping("/exchange")
	public StockExchange saveExchange(@RequestBody StockExchange stockExchange)
	{
		return stockExchangeRepository.save(stockExchange);
	}
	
	@GetMapping("/exchange")
	public List<StockExchange> getExchange()
	{
		return stockExchangeRepository.findAll();
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
