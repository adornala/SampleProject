package com.bank.crditapp.repositories;

import com.bank.crditapp.domains.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FriendRepository extends JpaRepository<Friend, Integer> {
    // Select * from Friend where firstName = fName and lastName lName
    Collection<Friend> findAllByFirstNameAndLastName(String fName, String lName);

}
