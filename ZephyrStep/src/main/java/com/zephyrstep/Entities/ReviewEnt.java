package com.zephyrstep.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class ReviewEnt {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int reviewId;

	    @Column(nullable = false)
	    private int userId;

	    @Column(nullable = false)
	    private int shoeId;

	    @Column(nullable = false)
	    private int rating;

	    @Column(columnDefinition = "TEXT")
	    private String comment;

	    // Constructors
	    public ReviewEnt() {}

	    public ReviewEnt(int userId, int shoeId, int rating, String comment) {
	        this.userId = userId;
	        this.shoeId = shoeId;
	        this.rating = rating;
	        this.comment = comment;
	    }

	    // Getters and Setters
	    public int getReviewId() {
	        return reviewId;
	    }

	    public void setReviewId(int reviewId) {
	        this.reviewId = reviewId;
	    }

	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }

	    public int getShoeId() {
	        return shoeId;
	    }

	    public void setShoeId(int shoeId) {
	        this.shoeId = shoeId;
	    }

	    public int getRating() {
	        return rating;
	    }

	    public void setRating(int rating) {
	        this.rating = rating;
	    }

	    public String getComment() {
	        return comment;
	    }

	    public void setComment(String comment) {
	        this.comment = comment;
	    }
	}

	
