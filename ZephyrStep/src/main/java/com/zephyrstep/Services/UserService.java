package com.zephyrstep.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zephyrstep.Entities.UserEnt;
import com.zephyrstep.Repositories.UserRepo;
import java.util.List;
import java.util.Optional;

@Service

public class UserService {



	    @Autowired
	    private UserRepo repo;

	    
	    public UserService createUser(UserService user) {
	        return repo.saveAll(user);
	    }

	  
	    public List<UserEnt> getAllUsers() {
	        return repo.findAll();
	    }

	   
	    public Optional<UserEnt> getUserById(int id) {
	        return repo.findById(id);
	    }

	    
	    public UserEnt updateUser(int id, UserEnt updatedUser) {
	        return repo.findById(id)
	            .map(user -> {
	                user.setName(updatedUser.getName());
	                user.setEmail(updatedUser.getEmail());
	                user.setPassword(updatedUser.getPassword());
	                return repo.save(user);
	            })
	            .orElseGet(() -> {
	                updatedUser.setUserId(id);
	                return repo.save(updatedUser);
	            });
	    }

	  
	    public void deleteUser(int id) {
	    	repo.deleteById(id);
	    }
	}


