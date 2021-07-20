package com.abhishek.stockchart.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.stockchart.entity.Company;
import com.abhishek.stockchart.entity.IpoDetails;
import com.abhishek.stockchart.repository.CompanyRepository;
import com.abhishek.stockchart.repository.IpoDetailsRepository;

@Service
public class CompanyServiceImpl implements CompanyService
{
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private IpoDetailsRepository ipoDetailsRepository;
	
	@Override
	public Company saveCompany(Company company) {
		// TODO Auto-generated method stub
		return companyRepository.save(company);
	}

	@Override
	public List<Company> getCompanyList() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}

	@Override
	public Company getCompanyByName(String name) {
		// TODO Auto-generated method stub
		return companyRepository.findByCompNameIgnoreCase(name);
	}

	@Override
	public Company updateCompany(Long id, Company company) {
		// TODO Auto-generated method stub
		Company comp = companyRepository.findById(id).get();
		
		if(Objects.nonNull(company.getCompName()) && !"".equalsIgnoreCase(company.getCompName()))
			comp.setCompName(company.getCompName());
		if(Objects.nonNull(company.getTurnover()))
			comp.setTurnover(company.getTurnover());
		if(Objects.nonNull(company.getCeo()) && !"".equalsIgnoreCase(company.getCeo()))
			comp.setCeo(company.getCeo());
		if(Objects.nonNull(company.getBoardOfDirectors()) && !"".equalsIgnoreCase(company.getBoardOfDirectors()))
			comp.setBoardOfDirectors(company.getBoardOfDirectors());
		if(Objects.nonNull(company.getCompBrief()) && !"".equalsIgnoreCase(company.getCompBrief()))
			comp.setCompBrief(company.getCompBrief());
		
		//updating ipo details
		if(Objects.isNull(comp.getIpo()))
		{
			ipoDetailsRepository.save(company.getIpo());
			comp.setIpo(company.getIpo());
		}
		else 
		{
			if(Objects.nonNull(company.getIpo().getPricePerShare()))
				comp.getIpo().setPricePerShare(company.getIpo().getPricePerShare());
			if(Objects.nonNull(company.getIpo().getNoOfShares()))
				comp.getIpo().setNoOfShares(company.getIpo().getNoOfShares());
			if(Objects.nonNull(company.getIpo().getOpenDateTime()))
				comp.getIpo().setOpenDateTime(company.getIpo().getOpenDateTime());
		}
		
				
		return companyRepository.save(comp);
	}
	
}
