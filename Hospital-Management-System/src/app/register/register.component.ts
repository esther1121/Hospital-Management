import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: 'register.component.html',
})
export class RegisterComponent {
  adminname: string ="";
  email: string ="";
  password: string ="";
adminname1: any;


  constructor(private http: HttpClient )
  {

  }
  save()
  {
  
    let bodyData = {
      "adminname" : this.adminname,
      "email" : this.email,
      "password" : this.password
    };
    this.http.post("http://localhost:8084/api/v1/admin/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Employee Registered Successfully");

    });
  }

}