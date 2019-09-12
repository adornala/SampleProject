package com.bank.crditapp.resources;

import com.bank.crditapp.domains.Person;
import com.bank.crditapp.service.PersonServicesImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonResources {

    private final PersonServicesImpl personServicesImpl;

    public PersonResources(PersonServicesImpl personServicesImpl) {
        this.personServicesImpl = personServicesImpl;
    }

    // CRUD - Create, Read, Update and Delete
    //         POST    GET   PUT        DELETE

    @PostMapping("/person")
    public String addPerson(@RequestBody Person person) {
        Person person1 = personServicesImpl.create(person);
        return person1.getFirstName();
    }

    @GetMapping("/person")
    public Person getPerson(@RequestParam int id) {
        return personServicesImpl.getPerson(id);
    }

    @GetMapping("/getAllPerson")
    public List<Person> getAllPersons() {
        return personServicesImpl.getAllPersons();
    }

}
