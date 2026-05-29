package com.example.signup.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "signup")
public class Signup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reference_id",nullable = false, length =100)
    private int referenceId;
    @Column(name="first_name",nullable = false,length =10)
    private String firstName;
    @Column(name="middle_name",nullable = true ,length =10)
    private String middleName;
    @Column(name = "last_name",nullable = false,length =100)
    private String lastName;

    @Column(name="emailid",unique = true, nullable = false,length =100)
    private String emailid;
    @Column(name="mobile_number",nullable = false,length =100)
    private Long mobileNumber;
    @Column(name="password",nullable = false,length =100)
    private String password;
    public Signup() {
    }

    public int getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(int referenceId) {
        this.referenceId = referenceId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}