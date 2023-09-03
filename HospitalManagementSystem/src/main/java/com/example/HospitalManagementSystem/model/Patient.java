package com.example.HospitalManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="patient_id",length=50)
	private int patientid;
	@Column(name="patient_first_name")
	private String patientfirstname;
	@Column(name="patient_last_name")
	private String patientlastname;
	@Column(name="patient_email",unique=true)
	private String patientemail;
	@Column(name="patient_mobile",unique=true)
	private int patientmobile;
	@Column(name="patient_password")
	private String patientpassword;
	
	public Patient() {
		super();
	}

	

	public Patient(int patientid, String patientfirstname, String patientlastname, String patientemail,
			int patientmobile, String patientpassword) {
		super();
		this.patientid = patientid;
		this.patientfirstname = patientfirstname;
		this.patientlastname = patientlastname;
		this.patientemail = patientemail;
		this.patientmobile = patientmobile;
		this.patientpassword = patientpassword;
	}



	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public String getPatientfirstname() {
		return patientfirstname;
	}

	public void setPatientfirstname(String patientfirstname) {
		this.patientfirstname = patientfirstname;
	}

	public String getPatientlastname() {
		return patientlastname;
	}

	public void setPatientlastname(String patientlastname) {
		this.patientlastname = patientlastname;
	}

	public String getPatientemail() {
		return patientemail;
	}

	public void setPatientemail(String patientemail) {
		this.patientemail = patientemail;
	}

	public int getPatientmobile() {
		return patientmobile;
	}

	public void setPatientmobile(int patientmobile) {
		this.patientmobile = patientmobile;
	}

	public String getPatientpassword() {
		return patientpassword;
	}



	public void setPatientpassword(String patientpassword) {
		this.patientpassword = patientpassword;
	}



	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", patientfirstname=" + patientfirstname + ", patientlastname="
				+ patientlastname + ", patientemail=" + patientemail + ", patientmobile=" + patientmobile
				+ ", patientpassword=" + patientpassword + "]";
	}
	
	
	


	
	
	
}
