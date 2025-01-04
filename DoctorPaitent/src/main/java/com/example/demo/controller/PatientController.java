package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping("/getAllPaitent")
	public List<Patient> getAllPaitent(){
		
		return patientService.getAllPaitent();
	}
}
