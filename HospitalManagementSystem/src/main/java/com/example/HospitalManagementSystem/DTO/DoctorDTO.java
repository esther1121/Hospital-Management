package com.example.HospitalManagementSystem.DTO;

public class DoctorDTO {

	
	private int doctorid;
	private String doctorfirstname;
	private String doctorlastname;
	private String doctoremail;
	private int doctormobile;
	private String doctorpassword;
	
	
	public DoctorDTO() {
		super();
	}


	public DoctorDTO(int doctorid, String doctorfirstname, String doctorlastname, String doctoremail,
			int doctormobile,String doctorpassword) {
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
		return "DoctorDTO [doctorid=" + doctorid + ", doctorfirstname=" + doctorfirstname + ", doctorlastname="
				+ doctorlastname + ", doctoremail=" + doctoremail + ", doctormobile=" + doctormobile
				+ ", doctorpassword=" + doctorpassword + "]";
	}
	
	

	


	
	
	
	
	
}
