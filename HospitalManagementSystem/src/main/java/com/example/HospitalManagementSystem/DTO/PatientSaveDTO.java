package com.example.HospitalManagementSystem.DTO;

public class PatientSaveDTO {
	
	private String patientfirstname;
	private String patientlastname;
	private String patientemail;
	private int patientmobile;
	private String patientpassword;
	
	public PatientSaveDTO() {
		super();
	}

	

	public PatientSaveDTO(String patientfirstname, String patientlastname, String patientemail, int patientmobile,
			String patientpassword) {
		super();
		this.patientfirstname = patientfirstname;
		this.patientlastname = patientlastname;
		this.patientemail = patientemail;
		this.patientmobile = patientmobile;
		this.patientpassword = patientpassword;
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
		return "PatientSaveDTO [patientfirstname=" + patientfirstname + ", patientlastname=" + patientlastname
				+ ", patientemail=" + patientemail + ", patientmobile=" + patientmobile + ", patientpassword="
				+ patientpassword + "]";
	}
	
	
	



	
	

}
