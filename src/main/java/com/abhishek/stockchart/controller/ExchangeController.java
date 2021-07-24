package com.abhishek.stockchart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.stockchart.entity.StockExchange;
import com.abhishek.stockchart.repository.StockExchangeRepository;

@CrossOrigin(origins="*")
@RestController
public class ExchangeController 
{
	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	
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
}
