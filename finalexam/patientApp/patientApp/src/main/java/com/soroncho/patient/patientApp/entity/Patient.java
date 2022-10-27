package com.soroncho.patient.patientApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @Column(name = "patientId")
    private int patientId;
    @Column(name = "patientNo")
    private String patientNo;
    @Column(name = "isInPatient")
    private String isInPatient;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "emailAddress")
    private String emailAddress;
    @Column(name = "contactPhone")
    private String contactPhone;
    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    public Patient() {
    }

    public Patient(String patientNo, String isInPatient, String fullname, String emailAddress, String contactPhone, LocalDate dateOfBirth) {
        this.patientNo = patientNo;
        this.isInPatient = isInPatient;
        this.fullname = fullname;
        this.emailAddress = emailAddress;
        this.contactPhone = contactPhone;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getIsInPatient() {
        return isInPatient;
    }

    public void setIsInPatient(String isInPatient) {
        this.isInPatient = isInPatient;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientNo='" + patientNo + '\'' +
                ", isInPatient='" + isInPatient + '\'' +
                ", fullname='" + fullname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
