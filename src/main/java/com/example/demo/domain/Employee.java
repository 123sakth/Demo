package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String EmailID;

    public Employee() {

    }
    public Employee(Long id, String firstName, String lastName , String EmailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.EmailID = EmailID;
    }

    public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		this.EmailID = emailID;
	}
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setLastName(String LastName) {
        this.lastName = lastName;
    }
    
}
