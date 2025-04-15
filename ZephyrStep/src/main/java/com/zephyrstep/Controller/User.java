package com.zephyrstep.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zephyrstep.Entities.UserEnt;
import com.zephyrstep.Repositories.UserRepo;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class User {


	    @Autowired
	    private UserRepo repo;

	    // Create new user
	    @PostMapping
	    public UserEnt createUser(@RequestBody User user) {
	        return repo.save(user);
	    }

	    // Get all users
	    @GetMapping
	    public List<UserEnt> getAllUsers() {
	        return repo.findAll();
	    }

	    // Get user by ID
	    @GetMapping("/{id}")
	    public Optional<UserEnt> getUserById(@PathVariable int id) {
	        return repo.findById(id);
	    }

	    // Update user
	    @PutMapping("/{id}")
	    public UserEnt updateUser(@PathVariable int id, @RequestBody User updatedUser) {
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

	    private void setUserId(int id) {
			// TODO Auto-generated method stub
			
		}

		private String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getEmail() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		// Delete user
	    @DeleteMapping("/{id}")
	    public void deleteUser(@PathVariable int id) {
	        repo.deleteById(id);
	    }
	}

	

