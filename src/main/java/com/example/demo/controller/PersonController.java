package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.PersonDto;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;

	@PostMapping("/person")
	String savePersonAndAddhar(@RequestBody PersonDto dto) {

		personService.addPerson(dto);

		return "Person added!";

	}

}
