package com.example.demo.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.HospitalDetails;

@RestController
public class HospitalDetailscontroller {

	   @GetMapping("/getHospitalDetailsOnPanel")
	    public List<HospitalDetails> getHospitalDetails() {
	        RestTemplate restTemplate = new RestTemplate();
	        String url = "http://localhost:9000/hospitaldetails";

	        ResponseEntity<List<HospitalDetails>> response = restTemplate.exchange(
	                url,
	                HttpMethod.GET,
	                null,
	                new ParameterizedTypeReference<List<HospitalDetails>>() {}
	        );

	        return response.getBody();
		
		
	}
}
