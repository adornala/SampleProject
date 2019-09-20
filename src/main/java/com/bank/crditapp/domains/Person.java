package com.bank.crditapp.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Person implements Serializable {

    @Id
    @Column(name = "identity")
    private int id = 0;

    @Column(name = "bank_first_name")
    private String firstName;

    private String lastName;

    @OneToMany
    private List<Friend> friends;

    public int getId() {
        return id;
    }

    public String setId(int id) {
        return String.valueOf(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }
}
