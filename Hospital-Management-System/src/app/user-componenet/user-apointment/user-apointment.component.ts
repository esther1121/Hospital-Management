import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-apointment',
  templateUrl: './user-apointment.component.html',
  styleUrls: ['./user-apointment.component.css']
})
export class UserApointmentComponent {
  firstname: string ="";
  lastname: string ="";
  appointmentdate:string="";
  reson: string ="";
 appointment1: any;

 constructor(private http: HttpClient ,private router: Router)
  {

  }




  onSubmit(){

    
    let bodyData = {
      "firstname":this.firstname,
      "lastname":this.lastname,
      "appointmentdate":this.appointmentdate,
      "reson":this.reson
    };
    this.http.post("http://localhost:8084/api/v1/appointment/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Appointment booked Successfully");

        this.router.navigateByUrl('user-Home');

    });

  }

}
