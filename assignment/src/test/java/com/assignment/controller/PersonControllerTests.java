package com.assignment.controller;

import com.assignment.model.Person;
import com.assignment.service.PersonService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonControllerTests {

    @Autowired
    static PersonService ps = new PersonService();
    static Person p;

    @BeforeAll
    private static void createTestPerson() {
        p = new Person("Ivan", 26);
        ps.savePerson(p);
    }

    @AfterAll
    private static void deleteTestPerson() {
        ps.deletePerson(p);
    }

    @Test
    public void testFindByName() {

        String name = p.getPerson_name();

        Person personToFind = ps.findByName(name);

        assertEquals(personToFind.getPerson_name(), name);
    }

    @Test
    public void testSavePerson() {

        List<Person> people = new ArrayList<>();
        Iterable<Person> returnedPeople = ps.getAllPeople();

        for (Person person : returnedPeople) {
            people.add(person);
        }

        assertTrue(people.contains(p));
    }
}