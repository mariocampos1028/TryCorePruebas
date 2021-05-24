import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Planeta } from '../../clases/planeta';
import { PlanetaService } from '../../services/planeta.service';
import { PersonaService } from '../../services/persona.service';
import { Persona } from 'src/app/clases/persona';
import { NgbModal } from "@ng-bootstrap/ng-bootstrap";

@Component({
  selector: 'app-planeta-detalle',
  templateUrl: './planeta-detalle.component.html',
  styleUrls: ['./planeta-detalle.component.css']
})
export class PlanetaDetalleComponent implements OnInit {
  
  planeta:Planeta={};
  listPersonas:Persona[]=[];
  constructor(private activate:ActivatedRoute,
              private planetaServ:PlanetaService, 
              private personaServ:PersonaService, public modal:NgbModal) {
                this.activate.params.subscribe(params=>{
      
                  this.planetaServ.getPlanetaById(params['id']).subscribe(resp=>{
                    this.planeta = resp;
                    this.planetaServ.aumentarContadorPlaneta(this.planeta.planeta_id).subscribe(resp2=>{
                      console.log(resp2);
                      this.planeta = resp2;
                      this.planeta.cantidad_personas = params['cantidadPersonas'];
                    })
                  })
                        
                });                   
 }

  ngOnInit(): void {
  }

  verDetallePlaneta(id:number,contenido){
    this.personaServ.getPersonasByIdPlaneta(id).subscribe(resp=>{
      this.listPersonas = resp;
      this.modal.open(contenido, {size:'lg', scrollable:true, centered:true});
    });
  }

  openSM(contenido){
    this.modal.open(contenido, {size:'lg', scrollable:true, centered:true});
  }

}
