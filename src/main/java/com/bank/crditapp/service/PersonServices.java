package com.bank.crditapp.service;

import com.bank.crditapp.domains.Person;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface PersonServices {

    Person save();

    Person create(Person person);

    void removing(Person person);

    Person reqAndRes(Date req, Date res);

    Person remove();

    Person addRelationShip();

    Person getPerson(int id);

    List<Person> getAllPersons();

    List<Person> getAllRecordcsbyFAL(String fName, String lName);

}
