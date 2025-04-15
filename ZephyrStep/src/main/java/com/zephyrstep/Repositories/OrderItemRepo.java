package com.zephyrstep.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zephyrstep.Entities.OrderItemEnt;

public interface OrderItemRepo extends JpaRepository<OrderItemEnt, Integer> {

}
