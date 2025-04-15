package com.zephyrstep.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class PaymentEnt {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int paymentId;

	    @Column(nullable = false)
	    private int orderId;

	    @Column(length = 50, nullable = false)
	    private String paymentStatus;

	    @Column(length = 50, nullable = false)
	    private String paymentMethod;

	    
	    public PaymentEnt() {
	    	
	    }

	    public PaymentEnt(int orderId, String paymentStatus, String paymentMethod) {
	        this.orderId = orderId;
	        this.paymentStatus = paymentStatus;
	        this.paymentMethod = paymentMethod;
	    }

	   
	    public int getPaymentId() {
	        return paymentId;
	    }

	    public void setPaymentId(int paymentId) {
	        this.paymentId = paymentId;
	    }

	    public int getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }

	    public String getPaymentStatus() {
	        return paymentStatus;
	    }

	    public void setPaymentStatus(String paymentStatus) {
	        this.paymentStatus = paymentStatus;
	    }

	    public String getPaymentMethod() {
	        return paymentMethod;
	    }

	    public void setPaymentMethod(String paymentMethod) {
	        this.paymentMethod = paymentMethod;
	    }
	}


