package com.example.HospitalManagementSystem.DTO;

public class DctorLoginDTO {
	
	
		private String doctoremail;
		private String doctorpassword;

		public DctorLoginDTO()
		{
			
		}

		public DctorLoginDTO(String doctoremail, String doctorpassword) {
		this.doctoremail = doctoremail;
		this.doctorpassword = doctorpassword;
		} //create getters and setters

}
