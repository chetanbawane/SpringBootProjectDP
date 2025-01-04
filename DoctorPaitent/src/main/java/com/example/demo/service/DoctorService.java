package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repos.DoctorRepos;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepos doctorRepos;
	
	public List<Doctor> getAllDoctor(){
		
		return doctorRepos.findAll();
	}
}
