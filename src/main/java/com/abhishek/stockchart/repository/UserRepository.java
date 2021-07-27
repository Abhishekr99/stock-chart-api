package com.abhishek.stockchart.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhishek.stockchart.model.StockPriceModel;
import com.abhishek.stockchart.model.User;
import com.abhishek.stockchart.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	
	@Query(
			value = "select u.username as username,u.email as email from User u where u.id = ?1"
			
	)
	UserModel getUserById(Long id);
}
