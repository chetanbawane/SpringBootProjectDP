package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repos.PatientRepos;

@Service
public class PatientService {

	@Autowired
	private PatientRepos patientRepos;
	
	public List<Patient> getAllPaitent(){
		
		return patientRepos.findAll();
	}
}
