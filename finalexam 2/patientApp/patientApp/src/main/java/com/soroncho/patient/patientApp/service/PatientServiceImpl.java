package com.soroncho.patient.patientApp.service;

import com.soroncho.patient.patientApp.dao.PatientDAO;
import com.soroncho.patient.patientApp.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {
    private PatientDAO patientDAO;

    @Autowired
    public PatientServiceImpl(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

    @Override
    @Transactional
    public List<Patient> findAll() {
        return patientDAO.findAll();
    }
}
