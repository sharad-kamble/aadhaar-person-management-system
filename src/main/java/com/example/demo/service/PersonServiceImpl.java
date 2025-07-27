package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.PersonDto;
import com.example.demo.entity.Addhar;
import com.example.demo.entity.Person;
import com.example.demo.repo.PersonRepo;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepo personRepo;

    @Override
    public void addPerson(PersonDto personDto) {
        Person p = new Person();
        p.setName(personDto.getPersonName());
        p.setEmail(personDto.getPersonEmail());

        // Addhar object from DTO
        Addhar addhar = personDto.getAddhar();

       addhar.setPerson(p); // setting back-reference (for bidirectional mapping) In the addhar persons obj is set 
       p.setAddhar(addhar); // setting adhar in person - in persons addhar object is set  

        personRepo.save(p);  // Cascade saves both  // saving parent entity
    }
}
