package com.example.HospitalManagementSystem.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	
	
	
	@Id
    @Column(name="appointment_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int appointmentid;
    @Column(name="first_name", length = 255)
    private String firstname;
    @Column(name="last_name", length = 255)
    private String lastname;
    @Column(name="appointmentdate", length = 255)
    private Date appointmentdate;
    @Column(name="reson", length = 255)
    private String reson;
	
    
    public Appointment() {
		super();
	}


	public Appointment(int appointmentid, String firstname, String lastname, Date appointmentdate, String reson) {
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
