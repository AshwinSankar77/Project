package com.zephyrstep.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zephyrstep.Entities.PaymentEnt;

public interface PaymentRepo extends JpaRepository<PaymentEnt, Integer> {

}
