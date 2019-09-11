package com.bank.crditapp.service;

import com.bank.crditapp.domains.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface PersonServices {

    Person save();

    Person create(Person person);

    Person removing(int id);

    Person reqAndRes(Date req, Date res);

    Person remove();

    Person addRelationShip();

}
