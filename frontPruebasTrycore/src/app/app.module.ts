import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { PersonaComponent } from './components/persona/persona.component';
import { PersonaDetalleComponent } from './components/persona-detalle/persona-detalle.component';
import { PlanetaComponent } from './components/planeta/planeta.component';
import { PlanetaDetalleComponent } from './components/planeta-detalle/planeta-detalle.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { PersonaService } from './services/persona.service';
import { PlanetaService } from './services/planeta.service';
import { HttpClientModule } from '@angular/common/http';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    PersonaComponent,
    PersonaDetalleComponent,
    PlanetaComponent,
    PlanetaDetalleComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    RouterModule,
    HttpClientModule,
    FontAwesomeModule,
    ReactiveFormsModule,
    FormsModule,
  ],
  exports:[
    NavbarComponent,
  ],
  providers: [PersonaService, PlanetaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
