package com.zephyrstep.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.math.BigDecimal;


@Entity
public class ShoeEnt {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int shoeId;

	    @Column(length = 255, nullable = false)
	    private String name;

	    @Column(precision = 10, scale = 2, nullable = false)
	    private BigDecimal price;

	    @Column(length = 255, nullable = false)
	    private String brand;

	    @Column(nullable = false)
	    private int size;

	    @Column(name = "stock_quantity", nullable = false)
	    private int stockQuantity;

	    
	    public ShoeEnt() {
	    	
	    }

	    public ShoeEnt(String name, BigDecimal price, String brand, int size, int stockQuantity) {
	        this.name = name;
	        this.price = price;
	        this.brand = brand;
	        this.size = size;
	        this.stockQuantity = stockQuantity;
	    }

	    
	    public int getShoeId() {
	        return shoeId;
	    }

	    public void setShoeId(int shoeId) {
	        this.shoeId = shoeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public BigDecimal getPrice() {
	        return price;
	    }

	    public void setPrice(BigDecimal price) {
	        this.price = price;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public int getSize() {
	        return size;
	    }

	    public void setSize(int size) {
	        this.size = size;
	    }

	    public int getStockQuantity() {
	        return stockQuantity;
	    }

	    public void setStockQuantity(int stockQuantity) {
	        this.stockQuantity = stockQuantity;
	    }
	
}
	
	

