package com.example.HospitalManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctor_id",length=50)
	private int doctorid;
	@Column(name="doctor_first_name")
	private String doctorfirstname;
	@Column(name="doctor_last_name")
	private String doctorlastname;
	@Column(name="doctor_email",unique=true)
	private String doctoremail;
	@Column(name="doctor_mobile",unique=true)
	private int doctormobile;
	@Column(name="doctor_password")
	private String doctorpassword;
	
	public Doctor() {
		super();
	}

	public Doctor(int doctorid, String doctorfirstname, String doctorlastname, String doctoremail, int doctormobile,String doctorpassword) {
		super();
		this.doctorid = doctorid;
		this.doctorfirstname = doctorfirstname;
		this.doctorlastname = doctorlastname;
		this.doctoremail = doctoremail;
		this.doctormobile = doctormobile;
		this.doctorpassword = doctorpassword;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getDoctorfirstname() {
		return doctorfirstname;
	}

	public void setDoctorfirstname(String doctorfirstname) {
		this.doctorfirstname = doctorfirstname;
	}

	public String getDoctorlastname() {
		return doctorlastname;
	}

	public void setDoctorlastname(String doctorlastname) {
		this.doctorlastname = doctorlastname;
	}

	public String getDoctoremail() {
		return doctoremail;
	}

	public void setDoctoremail(String doctoremail) {
		this.doctoremail = doctoremail;
	}

	public int getDoctormobile() {
		return doctormobile;
	}

	public void setDoctormobile(int doctormobile) {
		this.doctormobile = doctormobile;
	}

	public String getDoctorpassword() {
		return doctorpassword;
	}

	public void setDoctorpassword(String doctorpassword) {
		this.doctorpassword = doctorpassword;
	}

	@Override
	public String toString() {
		return "Doctor [doctorid=" + doctorid + ", doctorfirstname=" + doctorfirstname + ", doctorlastname="
				+ doctorlastname + ", doctoremail=" + doctoremail + ", doctormobile=" + doctormobile
				+ ", doctorpassword=" + doctorpassword + "]";
	}

	
	

	
		
	
}
