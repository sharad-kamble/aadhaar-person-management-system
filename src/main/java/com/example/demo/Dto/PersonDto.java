package com.example.demo.Dto;

import com.example.demo.entity.Addhar;

public class PersonDto {

	private String PersonName;
	private String PersonEmail;
	private Addhar addhar;

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public String getPersonEmail() {
		return PersonEmail;
	}

	public void setPersonEmail(String personEmail) {
		PersonEmail = personEmail;
	}

	public Addhar getAddhar() {
		return addhar;
	}

	public void setAddhar(Addhar addhar) {
		this.addhar = addhar;
	}

}
