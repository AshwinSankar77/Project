package com.zephyrstep.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class UserEnt {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int userId;

	    @Column(length = 255, nullable = false)
	    private String name;

	    @Column(length = 255, nullable = false, unique = true)
	    private String email;

	    @Column(length = 255, nullable = false)
	    private String password;

	    
	    public UserEnt() {
	    	
	    }

	    public UserEnt(String name, String email, String password) {
	        this.name = name;
	        this.email = email;
	        this.password = password;
	    }

	   
	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	}

	
	
	

