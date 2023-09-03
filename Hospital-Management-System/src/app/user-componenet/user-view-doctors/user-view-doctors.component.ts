import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Doctor } from 'src/app/doctor';
import { DoctorService } from 'src/app/doctor.service';

@Component({
  selector: 'app-user-view-doctors',
  templateUrl: './user-view-doctors.component.html',
  styleUrls: ['./user-view-doctors.component.css']
})
export class UserViewDoctorsComponent implements OnInit {
  
  doctors!: Doctor[]; 

  constructor(private doctorService:DoctorService ,private router:Router ){}

  ngOnInit(): void {
   
     this.getDoctors();


  }

  private getDoctors()
  {
    this.doctorService.getDoctorsList().subscribe(data =>{
      this.doctors = data;

    });
  }


  updateDoctor(id:number){

    this.router.navigate(['Home/Doctor/update-doctor',id]);
  }

  DeleteDoctor(id:number){
    this.doctorService.deleteDoctor(id).subscribe(data =>{
      console.log(data);
      this.getDoctors();

    })

  }

  DoctorDetails(id:number)
  {
    this.router.navigate(['Home/Doctor/doctor-details', id]);
  }
}