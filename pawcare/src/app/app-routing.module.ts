import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ErrorPageComponent } from './error/error-page/error-page.component';
import { LandingPageComponent } from './landing/landing-page/landing-page.component';

const routes: Routes = [
  { path: 'home', component: LandingPageComponent},
//  { path: 'mascotas', component: RegistroComponent},
//  { path: 'InicioSesion', component: InicioSesionComponent},
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
