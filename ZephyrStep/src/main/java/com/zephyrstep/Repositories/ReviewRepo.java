package com.zephyrstep.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zephyrstep.Entities.ReviewEnt;

public interface ReviewRepo extends JpaRepository<ReviewEnt, Integer> {

}
