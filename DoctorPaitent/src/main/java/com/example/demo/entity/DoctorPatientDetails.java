package com.example.demo.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table
@Entity(name = "doctorpatientdetails")
public class DoctorPatientDetails {

	@Id
	private int doctor_patient_id;
	
	@OneToOne
	@JoinColumn(name = "doctor_id")
	@JsonBackReference
	private Doctor doctor;
	
	@OneToOne
	@JoinColumn(name = "patient_id")
	@JsonBackReference
	private Patient patient;
	
	@Column
	@Temporal(TemporalType.DATE) 
	private Date consultation;
	
	@Column
	private String diagnosis,treatment_plan;

	public int getDoctor_patient_id() {
		return doctor_patient_id;
	}

	public void setDoctor_patient_id(int doctor_patient_id) {
		this.doctor_patient_id = doctor_patient_id;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getConsultation() {
		return consultation;
	}

	public void setConsultation(Date consultation) {
		this.consultation = consultation;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment_plan() {
		return treatment_plan;
	}

	public void setTreatment_plan(String treatment_plan) {
		this.treatment_plan = treatment_plan;
	}

	
	
}
