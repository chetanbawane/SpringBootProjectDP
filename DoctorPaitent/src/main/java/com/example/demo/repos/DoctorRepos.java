package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Doctor;

@Repository
public interface DoctorRepos extends JpaRepository<Doctor, Integer> {

	// JPQL query
	@Query("SELECT name from doctor")
	public List<String> getDoctorsByJPQL();
	
	@Query("SELECT d from doctor d where name=:n")
	public List<Doctor> getDoctorsByName(@Param("n") String name);
	
	//Native query
	@Query(value ="SELECT * from  doctor", nativeQuery = true)
	public List<Doctor> getDoctorsByNative();

	List<Doctor> findBySpecialization(String specialization);
	
}