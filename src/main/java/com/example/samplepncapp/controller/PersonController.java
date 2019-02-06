package com.example.samplepncapp.controller;

import com.example.samplepncapp.domain.Person;
import com.example.samplepncapp.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class PersonController {

    private PersonRepository pr;

    public PersonController(PersonRepository pr) {
        this.pr = pr;
    }

    @GetMapping("/")
    public String home(){
        return "Application Started";
    }

    @GetMapping("/persons")
    public Collection<Person> getAllPersons(){
        return pr.findAll();
    }

    @GetMapping("/person/{name}")
    public Collection<Person> getPersonByNameCustom(@PathVariable("name") String name){
        return pr.findByNameCustom(name);
    }




}
