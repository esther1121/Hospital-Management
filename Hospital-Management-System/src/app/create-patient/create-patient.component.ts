import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';

import { Router } from '@angular/router';
import { PatientService } from '../patient.service';


@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent  implements OnInit {
  patient:Patient=new Patient();
 
  constructor(protected patientService:PatientService,private router:Router){}
 
 ngOnInit(): void {
   throw new Error('Method not implemented.');
 }
 
 savePatient(){
   this.patientService.createPatient(this.patient).subscribe(data =>{
     console.log(data);
   },
   (error:any)=>console.log(error));
   this.goToPatientList();
 
 }

 goToPatientList()
 {
   this.router.navigate(['/Home/Patient']);
 }



 onSubmit(){

     console.log(this.patient);
     this.savePatient();
   
 }
}

