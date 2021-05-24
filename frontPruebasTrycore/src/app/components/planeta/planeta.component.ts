import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from 'src/app/clases/persona';
import { Planeta } from 'src/app/clases/planeta';
import { PlanetaService } from '../../services/planeta.service';
import { NgbModal } from "@ng-bootstrap/ng-bootstrap";

@Component({
  selector: 'app-planeta',
  templateUrl: './planeta.component.html',
  styleUrls: ['./planeta.component.css']
})
export class PlanetaComponent implements OnInit {

  listPlanetas:Planeta[] = [];
  listTop3Planetas:Planeta[] = [];
  constructor(private planetaServ:PlanetaService,
              private router:Router,public modal:NgbModal) {
      this.planetaServ.getPlanetas().subscribe(resp=>{
        console.log(resp);
        
        this.listPlanetas = resp;
      });

      this.planetaServ.top3Planetas().subscribe(data =>{
        this.listTop3Planetas = data;
      })
   }

  ngOnInit(): void {
  }

  irDetallePlaneta(planeta:Planeta, cantidadPersonas:number){
    console.log(planeta.planeta_id);
    this.router.navigate(['/planetaDetalle',planeta.planeta_id,cantidadPersonas]);
  }

  openSM(contenido){
    this.modal.open(contenido, {size:'lg', scrollable:true, centered:true});
  }

}
