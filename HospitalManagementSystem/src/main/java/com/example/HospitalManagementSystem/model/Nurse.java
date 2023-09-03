package com.example.HospitalManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nurse")

public class Nurse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="nurse_id",length=50)
	private int nurseid;
	@Column(name="nurse_first_name")
	private String nursefirstname;
	@Column(name="nurse_last_name")
	private String nurselastname;
	@Column(name="nurse_email",unique=true)
	private String nurseemail;
	@Column(name="nurse_mobile",unique=true)
	private int nursemobile;
	@Column(name="nurse_password")
	private String nursepassword;
	
	
	public Nurse() {
		super();
	}


	public Nurse(int nurseid, String nursefirstname, String nurselastname, String nurseemail, int nursemobile,String nursepassword) {
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
		return "Nurse [nurseid=" + nurseid + ", nursefirstname=" + nursefirstname + ", nurselastname=" + nurselastname
				+ ", nurseemail=" + nurseemail + ", nursemobile=" + nursemobile + ", nursepassword=" + nursepassword
				+ "]";
	}
	
	


	
	
	
	
}
