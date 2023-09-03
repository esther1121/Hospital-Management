import { Component, OnInit } from '@angular/core';
import { Nurse } from 'src/app/nurse';
import { NurseService } from 'src/app/nurse.service';

@Component({
  selector: 'app-user-view-nurce',
  templateUrl: './user-view-nurce.component.html',
  styleUrls: ['./user-view-nurce.component.css']
})
export class UserViewNurceComponent implements OnInit{
  
  nueses!:Nurse[];
  
  constructor(private nurseService:NurseService ){}

  ngOnInit(): void {
   
     this.getnurses();


  }

  private getnurses()
  {
    this.nurseService.getNursesList().subscribe(data =>{
      this.nueses = data;

    });
  }

}
