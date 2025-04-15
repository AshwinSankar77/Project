package com.zephyrstep.Repositories;
import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zephyrstep.Controller.Shoe;
import com.zephyrstep.Entities.ShoeEnt;

@Repository

public interface ShoeRepo extends JpaRepository<ShoeEnt, Integer> {

	Shoe save(Shoe shoe);


	public String getName(); 
	BigDecimal getPrice() ;
	public String getBrand() ;
	
	}
	
