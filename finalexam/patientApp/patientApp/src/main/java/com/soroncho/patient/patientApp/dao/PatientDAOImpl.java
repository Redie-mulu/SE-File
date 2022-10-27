package com.soroncho.patient.patientApp.dao;

import com.soroncho.patient.patientApp.entity.Patient;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PatientDAOImpl implements PatientDAO{
    private EntityManager entityManager;

    @Autowired
    public PatientDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Patient> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Patient> query =
                currentSession.createQuery("from Patient order by fullname",Patient.class);
        List<Patient> patients = query.getResultList();

        return patients;
    }
}
