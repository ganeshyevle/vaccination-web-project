package com.practice.firstproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idDetails;
    private String idTypes;
    private String name;
    private String contactNumber;
    private String vaccineName;
    public User() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdDetails() {
        return idDetails;
    }
    public void setIdDetails(String idDetails) {
        this.idDetails = idDetails;
    }
    public String getIdTypes() {
        return idTypes;
    }
    public void setIdTypes(String idTypes) {
        this.idTypes = idTypes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", idDetails=" + idDetails + ", idTypes=" + idTypes + ", name=" + name
                + ", contactNumber=" + contactNumber + ", vaccineName=" + vaccineName + "]";
    }

    
   
}
