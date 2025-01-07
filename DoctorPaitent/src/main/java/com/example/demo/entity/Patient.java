package com.example.demo.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table
@Entity(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	@Column
	String fname,lname,address,contact; 
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date birthdate;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	@JsonBackReference
	private Doctor doctor;
	
	@OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
	private DoctorPatientDetails doctorPatientDetails;
	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Doctor getDoctor_id() {
		return doctor;
	}

	public void setDoctor_id(Doctor doctor_id) {
		this.doctor = doctor_id;
	}

	public DoctorPatientDetails getDoctorPatientDetails() {
		return doctorPatientDetails;
	}

	public void setDoctorPatientDetails(DoctorPatientDetails doctorPatientDetails) {
		this.doctorPatientDetails = doctorPatientDetails;
	}
	
	
}