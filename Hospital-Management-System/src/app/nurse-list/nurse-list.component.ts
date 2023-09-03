import { Component, OnInit } from '@angular/core';
import { Nurse } from '../nurse';
import { NurseService } from '../nurse.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-nurse-list',
  templateUrl: './nurse-list.component.html',
  styleUrls: ['./nurse-list.component.css']
})
export class NurseListComponent implements OnInit{
  
  nueses!:Nurse[];
  
  constructor(private nurseService:NurseService,private router:Router ){}

  ngOnInit(): void {
   
     this.getnurses();


  }

  private getnurses()
  {
    this.nurseService.getNursesList().subscribe(data =>{
      this.nueses = data;

    });
  }

  updateNurse(id:number){

    this.router.navigate(['Home/Nurse/update-nurse',id]);
  }

  DeleteNurse(id:number){
    this.nurseService.deleteNurse(id).subscribe(data =>{
      console.log(data);
      this.getnurses();

    })

  }

  NurseDetails(id:number)
  {
    this.router.navigate(['Home/Nurse/nurse-details', id]);
  }


}
