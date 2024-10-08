import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { administrador } from '../model/administrador/administrador';

@Injectable({
  providedIn: 'root'
})
export class AdministradorService {

  constructor(
    private http: HttpClient) { 
  }

  findByCedula(cedula: number): Observable<administrador> {
    return this.http.get<administrador>('http://localhost:8080/admin/'+cedula);
  }
}
