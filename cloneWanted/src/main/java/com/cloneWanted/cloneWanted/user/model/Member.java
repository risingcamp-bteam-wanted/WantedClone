package com.cloneWanted.cloneWanted.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class Member {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    @Column(name = "MemberID", nullable = false)
    private Long MemberID;
    @Column(name = "Name", nullable = false, length = 20)
    private String Name;
    @Column(name = "PhoneNumber", nullable = false, length = 20)
    private String PhoneNumber;
    @Column(name = "Name", nullable = false, length = 200)
    private String Password;
    @Column(name = "Name", nullable = false, length = 20)
    private String Email;
    @Column(name = "Name", nullable = false)
    private Boolean IsMember;

    public Member(Long MemberID, String name, String phoneNumber, String password, String email, Boolean isMember){
        this.MemberID = MemberID;
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.Password = password;
        this.Email = email;
        this.IsMember = isMember;
    }

    public Member() {

    }


    public void setId(Long id) {
        this.MemberID = id;
    }

    public Long getId() {
        return MemberID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Boolean getMember() {
        return IsMember;
    }

    public void setMember(Boolean member) {
        IsMember = member;
    }
}
