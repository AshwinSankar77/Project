package com.zephyrstep.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zephyrstep.Entities.OrderEnt;

public interface OrderRepo extends JpaRepository<OrderEnt, Integer>{

}
