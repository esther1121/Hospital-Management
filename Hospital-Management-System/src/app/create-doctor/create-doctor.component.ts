import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-doctor',
  templateUrl: './create-doctor.component.html',
  styleUrls: ['./create-doctor.component.css']
})
export class CreateDoctorComponent implements OnInit {
   doctor:Doctor=new Doctor();
  
   constructor(protected doctorService:DoctorService,private router:Router){}
  
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  
  saveDoctor(){
    this.doctorService.createDoctor(this.doctor).subscribe(data =>{
      console.log(data);
    },
    (error:any)=>console.log(error));
    this.goToDoctorList();
  
  }

  goToDoctorList()
  {
    this.router.navigate(['/Home/Doctor']);
  }



  onSubmit(){

      console.log(this.doctor);
      this.saveDoctor();
    
  }
}
