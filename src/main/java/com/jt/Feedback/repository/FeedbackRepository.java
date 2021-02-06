package com.jt.Feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jt.Feedback.model.User;
 
 
@Repository
public interface FeedbackRepository 
        extends JpaRepository<User, Integer> {
 
}