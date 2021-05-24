import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from 'src/app/clases/persona';
import { PersonaService } from '../../services/persona.service';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {
  
  personas:Persona[] = [];
  persona:Persona={};
  constructor(private personaServ:PersonaService,
             private router:Router) { 
    this.personaServ.getPersonas().subscribe(resp=>{
      console.log(resp);
      this.personas = resp;
      
    });
  }

  ngOnInit(): void {
  }

  irDetallePersona(persona: Persona, planeta:string){
    this.router.navigate(['/personaDetalle',persona.id,planeta])
  }

}
