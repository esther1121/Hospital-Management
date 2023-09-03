import { HttpClient } from '@angular/common/http';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NavbarService } from '../services/navbar.service';

@Component({
  selector: 'app-login',
  templateUrl: 'login.component.html'
})
export class LoginComponent implements OnInit,OnDestroy {
 

  email: string ="";
  password: string ="";


  constructor(private router: Router,private http: HttpClient,private navbarService:NavbarService) {}
  
  ngOnInit():void{
  
  }
  ngOnDestroy(){
    this.navbarService.display();
  }
  


  Login() {
    console.log(this.email);
    console.log(this.password);
 
    let bodyData = {
      email: this.email,
      password: this.password,
    };
 
        this.http.post("http://localhost:8084/api/v1/admin/login", bodyData).subscribe(  (resultData: any) => {
        console.log(resultData);
 
        if (resultData.message == "Email not exits")
        {
      
          alert("Email not exits");
    
 
        }
        else if(resultData.message == "Login Success")
    
         {
          this.router.navigateByUrl('Home');
        }
        else
        {
          alert("Incorrect Email and Password not match");
        }

      });
    }
    
  


}