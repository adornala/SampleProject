package com.bank.crditapp.service;

import com.bank.crditapp.domains.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonServices {

    Person save();

    Person remove();

    Person addRelationShip();

}
