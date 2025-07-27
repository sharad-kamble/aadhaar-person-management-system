package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Addhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String addharNo;
	@OneToOne
	@JoinColumn(name = "person_id")
	@JsonBackReference
	private Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddharNo() {
		return addharNo;
	}

	public void setAddharNo(String addharNo) {
		this.addharNo = addharNo;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
