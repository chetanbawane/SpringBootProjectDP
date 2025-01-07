package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/getAllDoctors")
	public List<String> getAllDoctors() {
		return doctorService.getDoctorsByJPQL();
	}
	
	@GetMapping("/getAllDoctorsByJPQL")
	public List<Doctor> getAllDoctorsByName() {
		return doctorService.getDoctorsByName();
	}
	
	@GetMapping("/getAllDoctorsByNative")
	public List<Doctor> getAllDoctorsByNative() {
		return doctorService.getDoctorsByNative();
	}
	
	//PathvariableUse
	@GetMapping("/getDoctorbyId/{id}")
	public Doctor getDoctorbyId(@PathVariable("id") int id){
		 return doctorService.getDoctorbyId(id);
	}
	
	//RequestParamUse
	@GetMapping("/getDoctorReqestParam")
	public List<Doctor> getDoctorReqestParam(@RequestParam("specilization") String specilization){
		return doctorService.getDoctorReqestParam(specilization);
	}
	
	@PostMapping("/saveDoctor")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctor(doctor);
	}
}
