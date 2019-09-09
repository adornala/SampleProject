package com.bank.crditapp.repositories;

import com.bank.crditapp.domains.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
