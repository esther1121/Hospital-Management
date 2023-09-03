import { Component, OnInit } from '@angular/core';
import { Nurse } from '../nurse';
import { NurseService } from '../nurse.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-nurse',
  templateUrl: './update-nurse.component.html',
  styleUrls: ['./update-nurse.component.css']
})
export class UpdateNurseComponent implements OnInit {
  id!:number;
  nurse:Nurse=new Nurse();
 
  constructor(protected nurseService:NurseService,private route:ActivatedRoute,private router:Router ){}
 
 ngOnInit(): void {
  this.id=this.route.snapshot.params['id'];
   this.nurseService.getNurseById(this.id).subscribe(data =>{
this.nurse=data;
},error =>console.log(error));

 }
 
 onSubmit(){

     this.nurseService.updateNurse(this.id,this.nurse).subscribe(data =>{
    this.goToNurseList();
     },
     (error:any)=>console.log(error));
     
 }
 goToNurseList()
 {
   this.router.navigate(['/Home/Nurse']);
 }


}