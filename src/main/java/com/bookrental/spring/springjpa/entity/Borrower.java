package com.bookrental.spring.springjpa.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component

@Entity
@Table(name = "employees")
public class Borrower {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String firstname;
    private String lastname;

    @NotNull
    @Size(min = 1, max = 20)
    @Pattern(regexp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z-]+" +
            "(\\.A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    @Email
    private String email;

    private long loan;

    public Borrower() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getLoan() {
        return loan;
    }

    public void setLoan(long loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", loan=" + loan +
                '}';
    }
}
