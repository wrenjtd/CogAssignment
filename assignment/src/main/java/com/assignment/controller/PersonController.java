package com.assignment.controller;

import com.assignment.model.Person;
import com.assignment.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/addperson")
    public @ResponseBody Person savePerson(@RequestBody Person p){
        ps.savePerson(p);
        return p;
    }

}