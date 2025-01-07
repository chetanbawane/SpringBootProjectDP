package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DoctorPatientDetails;
import com.example.demo.repos.DoctorPatientDetailRepos;

@Service
public class DoctorPatientDetailsService {

	@Autowired
	private DoctorPatientDetailRepos doctorPatientDetailRepos;
	
	public List<DoctorPatientDetails> getDetails(){
		return doctorPatientDetailRepos.findAll();
		}
}
