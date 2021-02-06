package com.jt.Feedback.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
 
@Entity
@Table(name="feedback")

public class User {
 
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)   
    private int  id;
     
    @Column
    private String name;
     

     
    @Column
    private String comment;
    @Column
    private int rating;
     
    
    //Setters and getters
 public User() {
	 
 }
    public User(@JsonProperty int id, @JsonProperty String name, @JsonProperty String comment, 
    		@JsonProperty int rating) {
		super();
		this.id = id;
		this.name = name;
		this.comment = comment;
		this.rating = rating;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", comment=" + comment + ", rating=" + rating + "]";
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
}