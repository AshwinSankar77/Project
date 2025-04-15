package com.zephyrstep.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderEnt {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int orderId;

	    @Column(nullable = false)
	    private int userId;

	    @Column(precision = 10, scale = 2, nullable = false)
	    private BigDecimal totalPrice;

	    @Column(nullable = false)
	    private LocalDateTime orderDate;

	    // Constructors
	    public OrderEnt() {}

	    public OrderEnt(int userId, BigDecimal totalPrice, LocalDateTime orderDate) {
	        this.userId = userId;
	        this.totalPrice = totalPrice;
	        this.orderDate = orderDate;
	    }

	   
	    public int getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }

	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }

	    public BigDecimal getTotalPrice() {
	        return totalPrice;
	    }

	    public void setTotalPrice(BigDecimal totalPrice) {
	        this.totalPrice = totalPrice;
	    }

	    public LocalDateTime getOrderDate() {
	        return orderDate;
	    }

	    public void setOrderDate(LocalDateTime orderDate) {
	        this.orderDate = orderDate;
	    }
	}

	
	
	
	

