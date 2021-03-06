package com.abhishek.stockchart.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Company 
{
	public Long getCompId() {
		return compId;
	}

	public void setCompId(Long compId) {
		this.compId = compId;
	}

	
	@Override
	public String toString() {
		return "Company [compId=" + compId + ", compName=" + compName + ", turnover=" + turnover + ", ceo=" + ceo
				+ ", boardOfDirectors=" + boardOfDirectors + ", compBrief=" + compBrief + "]";
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getCompBrief() {
		return compBrief;
	}

	public void setCompBrief(String compBrief) {
		this.compBrief = compBrief;
	}
	
	

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long compId;

	@Column(columnDefinition = "tinyint(1) default 1")
	private boolean active;

	//@Column(nullable = false)
	private String compName;



	//@Column(nullable = false)
	private Double turnover;



	//@Column(nullable = false)
	private String ceo;



	//@Column(nullable = false)
	@Type(type = "text")
	private String boardOfDirectors;



	//@Column(nullable = false)
	@Type(type = "text")
	private String compBrief;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(
			name = "ipo_id",
			referencedColumnName = "ipoId"
	)
	
	private IpoDetails ipo;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "sect_id", referencedColumnName = "sectId")	
	private Sector sector;
	
	/*@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
			name = "comp_exch_map",
			joinColumns = @JoinColumn(
					name = "comp_id",
					referencedColumnName = "compId"
			),
			inverseJoinColumns = @JoinColumn(
					name = "exch_id",
					referencedColumnName = "exchId"
			)
	)
	private List<StockExchange> stockExchanges = new ArrayList<>();*/
	
	/*@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)	
	private List<CompExchMap> compExchMap = new ArrayList<>();*/
	
	/*
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "company", cascade = CascadeType.REMOVE)
	@JsonIgnore
	private IPODetail ipo;



	@OneToMany(targetEntity = Companystockexchangemap.class)	
	private List<Companystockexchangemap> compstockmap;


	
	private StockExchange stockExchange;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Sector sector;
	*/

	

//	public List<CompExchMap> getCompExchMap() {
//		return compExchMap;
//	}
//
//	public void setCompExchMap(List<CompExchMap> compExchMap) {
//		this.compExchMap = compExchMap;
//	}

	public IpoDetails getIpo() {
		return ipo;
	}

	public void setIpo(IpoDetails ipo) {
		this.ipo = ipo;
	}

	public Company(Long compId, String compName, Double turnover, String ceo, String boardOfDirectors,
			String compBrief) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.compBrief = compBrief;
	}
	
	
	
	public Company(Long compId, String compName, Double turnover, String ceo, String boardOfDirectors, String compBrief,
			IpoDetails ipo) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.compBrief = compBrief;
		this.ipo = ipo;
		
	}

	public Company(){
		
	}
	
//	public void addToCompExchList(List<StockExchange> stockExchList, String compCode)
//	{
//		for(StockExchange ele : stockExchList)
//		{
//			CompExchMap obj = new CompExchMap(compCode,ele);
//			//obj.getCompany().setCompId(co.getCompId());
//			this.compExchMap.add(obj);
//		}
//		
//	}
	
//	public void addStockExcahnges(List<StockExchange> stockExchList)
//	{
//		for(StockExchange ele : stockExchList)
//		{
//			stockExchanges.add(ele);
//		}
//		
//	}

}
