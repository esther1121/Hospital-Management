package com.example.HospitalManagementSystem.DTO;

public class updateNurse {

	
	private int nurseid;
	private String nursefirstname;
	private String nurselastname;
	private String nurseemail;
	private int nursemobile;
	private String nursepassword;
	
	public updateNurse() {
		super();
	}

	public updateNurse(int nurseid, String nursefirstname, String nurselastname, String nurseemail,
			int nursemobile,String nursepassword) {
		super();
		this.nurseid = nurseid;
		this.nursefirstname = nursefirstname;
		this.nurselastname = nurselastname;
		this.nurseemail = nurseemail;
		this.nursemobile = nursemobile;
		this.nursepassword = nursepassword;
	}

	public int getNurseid() {
		return nurseid;
	}

	public void setNurseid(int nurseid) {
		this.nurseid = nurseid;
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
		return "updateNurse [nurseid=" + nurseid + ", nursefirstname=" + nursefirstname + ", nurselastname="
				+ nurselastname + ", nurseemail=" + nurseemail + ", nursemobile=" + nursemobile + ", nursepassword="
				+ nursepassword + "]";
	}
	

	

	
	
	
}
