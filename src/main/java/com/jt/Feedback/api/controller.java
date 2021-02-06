package com.jt.Feedback.api;

import java.util.List;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jt.Feedback.FeedbackApplication;
import com.jt.Feedback.model.User;
import com.jt.Feedback.service.FeedbackService;
 

 
@RestController
public class controller 
{
	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("templates/feedback.html");
	}
	Logger logger = LoggerFactory.getLogger(FeedbackApplication.class);

    @Autowired
    FeedbackService service;
    
   
    @GetMapping("/getall")
public List<User> getAllUsers(){
    	
        return service.listAllUser();
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User user = service.getUser(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/add")
    public void add(@RequestBody User user) {
		logger.info(user.toString());

    	service.saveUser(user);
    }
   
 
  
 
   
}