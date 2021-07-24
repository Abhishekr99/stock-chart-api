package com.abhishek.stockchart.repository;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.entity.StockPrice;
import com.abhishek.stockchart.model.StockPriceModel;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Long>
{
//	@Transactional
//	@Modifying
//	@Query(value = "delete from StockPrice s where s.company.compId = ?1")
//	public void deleteByCompId(Long compId);
	
	public List<StockPrice> findByCompCode(String compCode);
	
	@Query(
			value = "select s.stockId as stockId,s.exchName as exchName,s.compCode as compCode,s.datee as datee,s.timee as timee,s.sharePrice as sharePrice from StockPrice s where s.company.compId = ?1"
			//nativeQuery = true
	)
	List<StockPriceModel> getStockByCompanyId(Long compId);
	 
	
	/*@Query(
			name = "select avg(share_price) as sect_price,sect_name,datee "
					+ "from company as c natural join sector as s natural join stock_price where s.sect_id=?1 "
					+ "group by datee;",
			nativeQuery = true
	)
	public List<Object[]> getAllPrice(Long sectId);*/
}
