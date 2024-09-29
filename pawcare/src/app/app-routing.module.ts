import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ErrorPageComponent } from './error/error-page/error-page.component';
import { LandingPageComponent } from './landing/landing-page/landing-page.component';
import { MascotaTableComponent } from './model/mascota/mascota-table/mascota-table.component';
import { MascotaDetailComponent } from './model/mascota/mascota-detail/mascota-detail.component';
import { LoginComponent } from './model/login/login.component';
import { MascotaEditComponent } from './model/mascota/mascota-edit/mascota-edit.component';
import { MascotaFormComponent } from './model/mascota/mascota-form/mascota-form.component';


const routes: Routes = [
  { path: 'home', component: LandingPageComponent},
  { path: 'mascotas', component: MascotaTableComponent},
//  { path: 'InicioSesion', component: InicioSesionComponent},
  { path: 'mascota/form', component: MascotaFormComponent},
  { path: 'mascota/detail/:id', component: MascotaDetailComponent},
  { path: 'mascota/edit/:id', component: MascotaEditComponent},
  { path: 'login', component: LoginComponent},
  { path: '', pathMatch: 'full', redirectTo: 'home'},
  { path: '**', component: ErrorPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { 
    scrollPositionRestoration: 'enabled', // Restores scroll position after navigation
    anchorScrolling: 'enabled'           // Enables scrolling to anchor fragments like #section
  })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
