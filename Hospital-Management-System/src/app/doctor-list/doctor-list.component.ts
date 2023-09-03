import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-doctor-list',
  templateUrl: './doctor-list.component.html',
  styleUrls: ['./doctor-list.component.css']
})
export class DoctorListComponent implements OnInit {
  
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
