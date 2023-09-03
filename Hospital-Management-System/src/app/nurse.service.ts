import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Nurse } from './nurse';

@Injectable({
  providedIn: 'root'
})
export class NurseService {
  private baseURL = "http://localhost:8084/api/v1/Nurse";
  constructor(private httpClient:HttpClient ) { }

  getNursesList():Observable<Nurse[]>{
    return this.httpClient.get<Nurse[]>(`${this.baseURL}`);
  }

  createNurse(nurse:Nurse):Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,nurse);
  }

  getNurseById(id:number):Observable<Nurse>
{
  return this.httpClient.get<Nurse>(`${this.baseURL}/${id}`);


}
updateNurse(id:number,nurse:Nurse):Observable<Object>
{
  return this.httpClient.put(`${this.baseURL}/${id}`,nurse);
}

deleteNurse(id:number):Observable<Object>
{
  return this.httpClient.delete(`${this.baseURL}/${id}`);
}


}
