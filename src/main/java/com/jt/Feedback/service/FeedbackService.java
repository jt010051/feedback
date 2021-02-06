package com.jt.Feedback.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jt.Feedback.dao.UserDao;
import com.jt.Feedback.model.User;
import com.jt.Feedback.repository.FeedbackRepository;
 
import org.springframework.beans.factory.annotation.Autowired;

 
@Service
@Transactional

public class FeedbackService {




	 @Autowired
	    private FeedbackRepository feedbackRepository;
	    public List<User> listAllUser() {
	        return feedbackRepository.findAll();
	    }


public void saveUser(User user) {
	feedbackRepository.save(user);
}

public User getUser(Integer id) {
    return feedbackRepository.findById(id).get();
}

public void deleteUser(Integer id) {
	feedbackRepository.deleteById(id);
}
}