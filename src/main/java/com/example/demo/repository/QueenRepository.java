package com.example.demo.repository;

import java.util.List;

import com.example.demo.models.Queen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface QueenRepository extends MongoRepository<Queen, String>{

}
