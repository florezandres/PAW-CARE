import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ErrorPageComponent } from './error/error-page/error-page.component';

const routes: Routes = [
  { path: 'home', component: AppComponent},
  { path: '', pathMatch: 'full', redirectTo: 'home'},
  { path: '**', component: ErrorPageComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
