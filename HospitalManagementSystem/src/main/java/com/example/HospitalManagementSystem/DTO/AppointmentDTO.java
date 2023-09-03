package com.example.HospitalManagementSystem.DTO;

import java.util.Date;

public class AppointmentDTO {
	
	private int appointmentid;
    private String firstname;
    private String lastname;
    private Date  appointmentdate;
    private String reson;
    
	public AppointmentDTO() {
		
	}

	public AppointmentDTO(int appointmentid, String firstname, String lastname, Date appointmentdate, String reson) {
		super();
		this.appointmentid = appointmentid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.appointmentdate = appointmentdate;
		this.reson = reson;
	}

	public int getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(int appointmentid) {
		this.appointmentid = appointmentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getAppointmentdate() {
		return appointmentdate;
	}

	public void setAppointmentdate(Date appointmentdate) {
		this.appointmentdate = appointmentdate;
	}

	public String getReson() {
		return reson;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}
    
    
    
    
    

}
