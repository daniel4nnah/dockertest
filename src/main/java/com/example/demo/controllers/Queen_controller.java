package com.example.demo.controllers;

import java.util.List;

import com.example.demo.models.Queen;
import com.example.demo.repository.QueenRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class Queen_controller {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final QueenRepository userRepository;

	public Queen_controller(QueenRepository userRepository) {
		this.userRepository = userRepository;
	}

    @RequestMapping(value = "/verUsuarios", method = RequestMethod.GET)
    public List<Queen> getAllUsers() {
	LOG.info("Getting all users.");
	return userRepository.findAll();
    }

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/crear")
    public Queen addNewUsers(@RequestBody Queen queen) {
	LOG.info("Saving user.");
	return userRepository.save(queen);
}

}
