import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent {

  username: string ="";
  email: string ="";
  password: string ="";
username1!: any;


  constructor(private http: HttpClient )
  {

  }
  save()
  {
  
    let bodyData = {
      "username" : this.username,
      "email" : this.email,
      "password" : this.password
    };
    this.http.post("http://localhost:8084/api/v1/user/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("User Registered Successfully");

    });
  }


}
