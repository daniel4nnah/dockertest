package com.example.demo.controllers;

import java.util.List;

import com.example.demo.models.Queen;
import com.example.demo.repository.UserDAL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class userDALImp implements UserDAL{
    @Autowired
	private MongoTemplate mongoTemplate;

    @Override
	public List<Queen> getAllUsers() {
		return mongoTemplate.findAll(Queen.class);
	}

    @Override
	public Queen addNewUser(Queen queen) {
		mongoTemplate.save(queen);
		// Now, user object will contain the ID as well
		return queen;
	}

    
}
