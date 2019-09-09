package com.bank.crditapp.repositories;

import com.bank.crditapp.domains.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Integer> {
}
