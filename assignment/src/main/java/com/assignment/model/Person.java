package com.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name= "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int person_id;
    @Column
    private String person_name;
    @Column
    private int person_age;

    public Person() {
    }

    public Person(int person_id, String person_name, int person_age) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.person_age = person_age;
    }

    public Person(String person_name, int person_age) {
        this.person_name = person_name;
        this.person_age = person_age;
    }

    public int getPerson_id() {
        return this.person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return this.person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public int getPerson_age() {
        return this.person_age;
    }

    public void setPerson_age(int person_age) {
        this.person_age = person_age;
    }

    @Override
    public String toString() {
        return "{" +
            " person_id='" + getPerson_id() + "'" +
            ", person_name='" + getPerson_name() + "'" +
            ", person_age='" + getPerson_age() + "'" +
            "}";
    }




}