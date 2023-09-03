import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { NurseListComponent } from './nurse-list/nurse-list.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { CreateDoctorComponent } from './create-doctor/create-doctor.component';
import { CreateNurseComponent } from './create-nurse/create-nurse.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { UpdateDoctorComponent } from './update-doctor/update-doctor.component';
import { DoctorDetailsComponent } from './doctor-details/doctor-details.component';
import { DoctorLoginComponent } from './doctor-login/doctor-login.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { BookAppointmentComponent } from './book-appointment/book-appointment.component';
import { MainIndexComponent } from './main-index/main-index.component';
import { UserLoginComponent } from './user-componenet/user-login/user-login.component';
import { UserRegisterComponent } from './user-componenet/user-register/user-register.component';
import { UserHomeComponent } from './user-componenet/user-home/user-home.component';
import { UserViewDoctorsComponent } from './user-componenet/user-view-doctors/user-view-doctors.component';
import { UserViewNurceComponent } from './user-componenet/user-view-nurce/user-view-nurce.component';
import { UserApointmentComponent } from './user-componenet/user-apointment/user-apointment.component';
import { UserAboutUsComponent } from './user-componenet/user-about-us/user-about-us.component';
import { UpdateNurseComponent } from './update-nurse/update-nurse.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';


const routes: Routes = [

{path: '',component:MainIndexComponent},
{path: 'Admin-login',component:LoginComponent},
{path: 'User-login',component:UserLoginComponent},
{path: 'user-Home/Doctor',component:UserViewDoctorsComponent},
{path: 'user-Home/Nurse',component:UserViewNurceComponent},
{path: 'user-Home/appointment',component:UserApointmentComponent},
{path: 'user-Home/user-about-us',component:UserAboutUsComponent},

{path:'user-Home', component:UserHomeComponent},
{path:'Home', component:HomeComponent},
{path:'register',component: RegisterComponent},
{path:'User-login/User-register',component: UserRegisterComponent},
{path:'Home/Nurse', component:NurseListComponent},
{path:'Home/Doctor', component:DoctorListComponent},
{path:'Home/Patient', component:PatientListComponent},
{path:'Home/Doctor/Create-Doctor', component:CreateDoctorComponent},
{path:'Home/Nurse/Create-Nurse', component:CreateNurseComponent},
{path:'Home/Patient/Create-Patient', component:CreatePatientComponent},
{path:'Home/Doctor/update-doctor/:id', component:UpdateDoctorComponent},
{path:'Home/Nurse/update-nurse/:id', component:UpdateNurseComponent},
{path:'Home/Patient/update-patient/:id', component:UpdatePatientComponent},
{path:'Home/Doctor/doctor-details/:id', component:DoctorDetailsComponent},
{path:'Doctor-login', component:DoctorLoginComponent},
{path:'Home/About-us', component:AboutUsComponent},
{path:'Home/Book-appointment', component:BookAppointmentComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
