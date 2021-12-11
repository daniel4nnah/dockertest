package com.example.demo.repository;

import java.util.List;

import com.example.demo.models.Queen;

public interface UserDAL {
    List<Queen> getAllUsers();
    Queen addNewUser(Queen queen);
    
}
