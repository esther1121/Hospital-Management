package com.example.HospitalManagementSystem.DTO;

public class PatientUpdateDTO {
	
	private int patientid;
	private String patientfirstname;
	private String patientlastname;
	private String patientemail;
	private int patientmobile;
	private String patientpassword;
	
	public PatientUpdateDTO() {
		super();
	}

	

	public PatientUpdateDTO(int patientid, String patientfirstname, String patientlastname, String patientemail,
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
		return "PatientUpdateDTO [patientid=" + patientid + ", patientfirstname=" + patientfirstname
				+ ", patientlastname=" + patientlastname + ", patientemail=" + patientemail + ", patientmobile="
				+ patientmobile + ", patientpassword=" + patientpassword + "]";
	}
	
	


	
	
	

}
