package com.soroncho.patient.patientApp.dao;

import com.soroncho.patient.patientApp.entity.Patient;

import java.util.List;

public interface PatientDAO {
    public List<Patient> findAll();
}
