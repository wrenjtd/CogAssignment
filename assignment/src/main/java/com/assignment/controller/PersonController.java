package com.assignment.controller;

import com.assignment.model.Person;
import com.assignment.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService ps;

    @GetMapping("/{name}")
    public Person findByName(@PathVariable("name") String name){
        return ps.findByName(name);
    }

    
    @GetMapping("/get")
    public Iterable<Person> getAll(){
        return ps.getAllPeople();
    }

    @PostMapping("/save")
    public  Person savePerson(Person p){
        ps.savePerson(p);
        return p;
    }


    @DeleteMapping("/delete")
    public String deletePerson(Person p){
        ps.deletePerson(p);
        return "Person deleted";
    }
    
    @PutMapping("/update")
    public String updatePerson(Person p){
        ps.savePerson(p);
        return "Person updated";
    }

   

}