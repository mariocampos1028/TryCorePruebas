import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Planeta } from '../clases/planeta';

@Injectable({
  providedIn: 'root'
})
export class PlanetaService {

  constructor(private http:HttpClient) { }


  getPlanetas():Observable<Planeta[]>{
    return this.http.get<Planeta[]>('planeta/getPlanetas')
  }

  getPlanetaById(id:number):Observable<Planeta>{
    return this.http.get<Planeta>(`planeta/getPlanetaById?id=${id}`);
  }

  aumentarContadorPlaneta(id:number):Observable<Planeta>{
    return this.http.get<Planeta>(`planeta/AumentarContadorPlaneta?id=${id}`);
  }

  top3Planetas():Observable<Planeta[]>{
    return this.http.get<Planeta[]>('planeta/top3');
  }

  
}
