import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { NurseListComponent } from './nurse-list/nurse-list.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import {HttpClientModule}from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { CreateDoctorComponent } from './create-doctor/create-doctor.component';
import { CreateNurseComponent } from './create-nurse/create-nurse.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { FormsModule } from '@angular/forms';
import { UpdateDoctorComponent } from './update-doctor/update-doctor.component';
import { UpdateNurseComponent } from './update-nurse/update-nurse.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';
import { DoctorDetailsComponent } from './doctor-details/doctor-details.component';
import { NurseDetailsComponent } from './nurse-details/nurse-details.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { DoctorLoginComponent } from './doctor-login/doctor-login.component';
import { NurseLoginComponent } from './nurse-login/nurse-login.component';
import { PatientLoginComponent } from './patient-login/patient-login.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BookAppointmentComponent } from './book-appointment/book-appointment.component';
import { MainIndexComponent } from './main-index/main-index.component';
import { UserLoginComponent } from './user-componenet/user-login/user-login.component';
import { UserRegisterComponent } from './user-componenet/user-register/user-register.component';
import { UserHomeComponent } from './user-componenet/user-home/user-home.component';
import { UserViewDoctorsComponent } from './user-componenet/user-view-doctors/user-view-doctors.component';
import { UserViewNurceComponent } from './user-componenet/user-view-nurce/user-view-nurce.component';
import { UserApointmentComponent } from './user-componenet/user-apointment/user-apointment.component';
import { UserAboutUsComponent } from './user-componenet/user-about-us/user-about-us.component';


@NgModule({
  declarations: [
    AppComponent,
    DoctorListComponent,
    NurseListComponent,
    PatientListComponent,
    HomeComponent,
    CreateDoctorComponent,
    CreateNurseComponent,
    CreatePatientComponent,
    UpdateDoctorComponent,
    UpdateNurseComponent,
    UpdatePatientComponent,
    DoctorDetailsComponent,
    NurseDetailsComponent,
    PatientDetailsComponent,
    DoctorLoginComponent,
    NurseLoginComponent,
    PatientLoginComponent,
    AboutUsComponent,
    RegisterComponent,
    LoginComponent,
    NavbarComponent,
    BookAppointmentComponent,
    MainIndexComponent,
    UserLoginComponent,
    UserRegisterComponent,
    UserHomeComponent,
    UserViewDoctorsComponent,
    UserViewNurceComponent,
    UserApointmentComponent,
    UserAboutUsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
