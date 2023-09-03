package com.example.HospitalManagementSystem.DTO;

public class NurseSaveDTO {
	
	private String nursefirstname;
	private String nurselastname;
	private String nurseemail;
	private int nursemobile;
	private String nursepassword;
	
	
	public NurseSaveDTO() {
		super();
	}


	public NurseSaveDTO(String nursefirstname, String nurselastname, String nurseemail, int nursemobile,String nursepassword) {
		super();
		this.nursefirstname = nursefirstname;
		this.nurselastname = nurselastname;
		this.nurseemail = nurseemail;
		this.nursemobile = nursemobile;
		this.nursepassword = nursepassword;
	}


	public String getNursefirstname() {
		return nursefirstname;
	}


	public void setNursefirstname(String nursefirstname) {
		this.nursefirstname = nursefirstname;
	}


	public String getNurselastname() {
		return nurselastname;
	}


	public void setNurselastname(String nurselastname) {
		this.nurselastname = nurselastname;
	}


	public String getNurseemail() {
		return nurseemail;
	}


	public void setNurseemail(String nurseemail) {
		this.nurseemail = nurseemail;
	}


	public int getNursemobile() {
		return nursemobile;
	}


	public void setNursemobile(int nursemobile) {
		this.nursemobile = nursemobile;
	}


	public String getNursepassword() {
		return nursepassword;
	}


	public void setNursepassword(String nursepassword) {
		this.nursepassword = nursepassword;
	}


	@Override
	public String toString() {
		return "NurseSaveDTO [nursefirstname=" + nursefirstname + ", nurselastname=" + nurselastname + ", nurseemail="
				+ nurseemail + ", nursemobile=" + nursemobile + ", nursepassword=" + nursepassword + "]";
	}
	
	


	
	
	

}
