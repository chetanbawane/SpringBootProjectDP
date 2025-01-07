package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DoctorPatientDetails;
import com.example.demo.service.DoctorPatientDetailsService;

@RestController
public class DoctorPitientDetailsController {

	@Autowired
	private DoctorPatientDetailsService doctorPatientDetailsService;
	
	@GetMapping("/getDoctorPatientDetails")
	List<DoctorPatientDetails> getDoctorPatientDetails(){
		return doctorPatientDetailsService.getDetails();
	}
}
