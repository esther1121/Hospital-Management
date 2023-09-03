import { Component, OnInit } from '@angular/core';
import { Nurse } from '../nurse';
import { NurseService } from '../nurse.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-nurse',
  templateUrl: './create-nurse.component.html',
  styleUrls: ['./create-nurse.component.css']
})
export class CreateNurseComponent  implements OnInit{
  nurse:Nurse=new Nurse();
  
  constructor(protected nurseService:NurseService,private router:Router){}
 
 
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  saveNurse(){
    this.nurseService.createNurse(this.nurse).subscribe(data =>{
      console.log(data);
    },
    (error:any)=>console.log(error));
    this.goToNurseList()
  
  }

  goToNurseList()
  {
    this.router.navigate(['/Home/Nurse']);
  }



  onSubmit(){

      console.log(this.nurse);
      this.saveNurse();
    
  }
}
