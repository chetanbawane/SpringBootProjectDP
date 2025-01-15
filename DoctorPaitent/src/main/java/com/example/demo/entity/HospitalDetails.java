package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HospitalDetails {

		@JsonProperty("hospital_id")
		private int hospital_id;
		
		@JsonProperty("name")
		private String name;
		
		@JsonProperty("address")
		private String address;
		
		
		public HospitalDetails() {}
		
		public int getHospital_id() {
			return hospital_id;
		}
		public void setHospital_id(int hospital_id) {
			this.hospital_id = hospital_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	}

