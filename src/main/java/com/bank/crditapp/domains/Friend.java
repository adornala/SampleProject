package com.bank.crditapp.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "BOTW_Friend")
public class Friend {

    @Id
    @Column(name = "botw_id")
    private int id;

    private String firstName;

    private String lastName;

    @Column(name = "botw_crazyness")
    private String crazyness;

    @ManyToOne
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCrazyness() {
        return crazyness;
    }

    public void setCrazyness(String crazyness) {
        this.crazyness = crazyness;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
