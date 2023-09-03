import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-patient',
  templateUrl: './update-patient.component.html',
  styleUrls: ['./update-patient.component.css']
})
export class UpdatePatientComponent implements OnInit {
  id!:number;
  patient:Patient=new Patient();
 
  constructor(protected patientService:PatientService,private route:ActivatedRoute,private router:Router ){}
 
 ngOnInit(): void {
  this.id=this.route.snapshot.params['id'];
   this.patientService.getPatientById(this.id).subscribe(data =>{
this.patient=data;
},error =>console.log(error));

 }
 
 onSubmit(){

     this.patientService.updatePatient(this.id,this.patient).subscribe(data =>{
    this.goToPatientList();
     },
     (error:any)=>console.log(error));
     
 }
 goToPatientList()
 {
   this.router.navigate(['/Home/Patient']);
 }


}