import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './landing/header/header.component';
import { FooterComponent } from './landing/footer/footer.component';
import { IntroComponent } from './landing/intro/intro.component';
import { ServiciosComponent } from './landing/servicios/servicios.component';
import { GaleriaComponent } from './landing/galeria/galeria.component';
import { ContactoComponent } from './landing/contacto/contacto.component';
import { ErrorPageComponent } from './error/error-page/error-page.component';
import { LandingPageComponent } from './landing/landing-page/landing-page.component';
import { MascotaTableComponent } from './model/mascota/mascota-table/mascota-table.component';
import { MascotaDetailComponent } from './model/mascota/mascota-detail/mascota-detail.component';
import { MascotaFormComponent } from './model/mascota/mascota-form/mascota-form.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './model/login/login.component';
import { MascotaEditComponent } from './model/mascota/mascota-edit/mascota-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    IntroComponent,
    ServiciosComponent,
    GaleriaComponent,
    ContactoComponent,
    ErrorPageComponent,
    LandingPageComponent,
    MascotaTableComponent,
    MascotaDetailComponent,
    MascotaFormComponent,
    LoginComponent,
    MascotaEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
