package com.zephyrstep.Repositories;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zephyrstep.Entities.UserEnt;
import com.zephyrstep.Services.UserService;

@Repository
public interface UserRepo extends JpaRepository<UserEnt,Integer> {

	UserService saveAll(UserService user);

	void deleteById(int id);

	User save(User user);

	UserEnt save(com.zephyrstep.Controller.User user);

}
