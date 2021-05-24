import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../clases/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  constructor(public http:HttpClient) { }

  getPersonas():Observable<Persona[]>{
    return this.http.get<Persona[]>('persona/getPersonas');
  }

  getPersonasById(id:number):Observable<Persona>{
    return this.http.get<Persona>(`persona/getPersonaById?id=${id}`);
  }

  aumentaPersonaYplaneta(id:number):Observable<Persona>{
    return this.http.get<Persona>(`persona/aumentaContadorPersonaYPlaneta?id=${id}`)
  }

  getPersonasByIdPlaneta(id:number):Observable<Persona[]>{
    return this.http.get<Persona[]>(`persona/getPersonasById?id=${id}`)
  }

}
