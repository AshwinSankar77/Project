package com.zephyrstep.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.math.BigDecimal;

@Entity
public class OrderItemEnt {
       
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int orderItemId;

	    @Column(nullable = false)
	    private int orderId;

	    @Column(nullable = false)
	    private int quantity;

	    @Column(precision = 10, scale = 2, nullable = false)
	    private BigDecimal price;

	    
	    public OrderItemEnt() {
	    	
	    }

	    public OrderItemEnt(int orderId, int quantity, BigDecimal price) {
	        this.orderId = orderId;
	        this.quantity = quantity;
	        this.price = price;
	    }

	    
	    public int getOrderItemId() {
	        return orderItemId;
	    }

	    public void setOrderItemId(int orderItemId) {
	        this.orderItemId = orderItemId;
	    }	
}
