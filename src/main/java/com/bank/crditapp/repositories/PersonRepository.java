package com.bank.crditapp.repositories;

import com.bank.crditapp.domains.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Collection<Person> findAllByFirstNameAndLastName(String fName, String lName);


}
