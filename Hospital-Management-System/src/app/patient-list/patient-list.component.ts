import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit{
  patients!:Patient[];
    
  constructor(private patientsService:PatientService,private router:Router){}


  ngOnInit(): void {
   
    this.getPatient();


 }

 private getPatient()
 {
  this.patientsService.getPatientList().subscribe(data=> {
    
    this.patients = data;
    
    
  });

 }

 updatePatient(id:number){

  this.router.navigate(['Home/Patient/update-patient',id]);
}

DeletePatient(id:number){
  this.patientsService.deletePatient(id).subscribe(data =>{
    console.log(data);
    this.getPatient();

  })

}

PatientDetails(id:number)
{
  this.router.navigate(['Home/Patient/patient-details', id]);
}



}
