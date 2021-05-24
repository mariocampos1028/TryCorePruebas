import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Persona } from '../../clases/persona';
import { Planeta } from '../../clases/planeta';
import { PersonaService } from '../../services/persona.service';

@Component({
  selector: 'app-persona-detalle',
  templateUrl: './persona-detalle.component.html',
  styleUrls: ['./persona-detalle.component.css']
})
export class PersonaDetalleComponent implements OnInit {
  
  forma:FormGroup;
  id:number;
  persona:Persona={};
  planeta:string='';
  planetaobj:Planeta = {};
  constructor(private fb:FormBuilder, 
              private activate:ActivatedRoute,
              private personaServ:PersonaService) {
    
    this.activate.params.subscribe(params=>{
      
      this.personaServ.getPersonasById(params['id']).subscribe(resp=>{
        this.persona = resp;
        console.log(resp);
        this.planeta = params['planeta'];
        console.log(this.planeta);
        this.personaServ.aumentaPersonaYplaneta(params['id']).subscribe(resp2=>{
            this.persona = resp2;
            
        });
        // this.cargarFormulario(resp);
      });
            
    });

   }

  ngOnInit(): void {
  }


}
