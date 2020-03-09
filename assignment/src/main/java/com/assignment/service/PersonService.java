package com.assignment.service;

import com.assignment.dao.PersonDao;
import com.assignment.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonDao pd;

    public Iterable<Person> getAllPeople(){
        return pd.findAll();
    }

    public Person findByName(String name){
        Iterable<Person> tempList = pd.findAll();
        Person temp = null;
        for(Person p: tempList){
            if(p.getPerson_name().equals(name)){
                temp = p;
            }
        }
        return temp;
    }

    public void deletePerson(Person p){
        pd.delete(p);
    }

    public void savePerson(Person p){
        pd.save(p);
    }

    public void updatePerson(Person p){
        pd.save(p);
    }
    
}