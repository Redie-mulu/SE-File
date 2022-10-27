package com.soroncho.patient.patientApp.rest;

import com.soroncho.patient.patientApp.entity.Patient;
import com.soroncho.patient.patientApp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RequestMapping("/")
public class PatientRestController {
    private PatientService patientService;

    @Autowired
    public PatientRestController(PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping("/patients")
    public String findAll(Model theModel){
        List<Patient> patients= patientService.findAll();
        theModel.addAttribute("patients",patients);

        return "patients";

    }
}
