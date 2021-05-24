import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PersonaComponent } from './components/persona/persona.component';
import { PersonaDetalleComponent } from './components/persona-detalle/persona-detalle.component';
import { PlanetaComponent } from './components/planeta/planeta.component';
import { PlanetaDetalleComponent } from './components/planeta-detalle/planeta-detalle.component';
import { HomeComponent } from './components/home/home.component';


const routes: Routes = [
  {path:'home', component:HomeComponent},
  {path:'persona', component: PersonaComponent},
  {path:'personaDetalle/:id/:planeta', component: PersonaDetalleComponent},
  {path:'planeta',component:PlanetaComponent},
  {path:'planetaDetalle/:id/:cantidadPersonas', component:PlanetaDetalleComponent},
  {path:'**', pathMatch:'full', redirectTo:'home'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
