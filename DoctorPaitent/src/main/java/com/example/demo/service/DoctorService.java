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
	
	public List<String> getDoctorsByJPQL(){
		 return doctorRepos.getDoctorsByJPQL();
	}
		 
		 public List<Doctor> getDoctorsByName(){
			 return doctorRepos.getDoctorsByName("Mohan Choudhari");
	}
		 
		 public List<Doctor> getDoctorsByNative(){
			 return doctorRepos.getDoctorsByNative();	}
		 
		 public Doctor getDoctorbyId(int id){
			 return doctorRepos.findById(id).orElseThrow(()-> new RuntimeException("doctor not found"));
		 }
		 
		 public List<Doctor> getDoctorReqestParam(String speciliztion){
			 return doctorRepos.findBySpecialization(speciliztion);
		 }
		 
		 // post RequetbodyUse
		 
		 public Doctor saveDoctor(Doctor doctor) {
			return doctorRepos.save(doctor);
			 
		 }
}
