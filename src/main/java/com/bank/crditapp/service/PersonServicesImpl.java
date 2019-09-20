package com.bank.crditapp.service;

import com.bank.crditapp.domains.Person;
import com.bank.crditapp.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PersonServicesImpl implements PersonServices {

    private final PersonRepository personRepository;

    public PersonServicesImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @Override
    public Person save() {

        Person per = new Person();





        int i = per.getId();

        return null;
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void removing(Person person) {
        personRepository.delete(person);
    }

    @Override
    public Person reqAndRes(Date req, Date res) {
        return null;
    }

    @Override
    public Person remove() {
        return null;
    }

    @Override
    public Person addRelationShip() {
        return null;
    }

    @Override
    public Person getPerson(int id) {
        return personRepository.getOne(id);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> getAllRecordcsbyFAL(String fName, String lName) {
        return null;
    }
}
