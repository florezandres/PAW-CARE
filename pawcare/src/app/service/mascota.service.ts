import { Injectable } from '@angular/core';
import { mascota } from '../model/mascota/mascota';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MascotaService {

  constructor() { }

  mascotaList: mascota[] = [
    {
        id: 1,
        nombre: "Jhony",
        peso: 15,
        raza: "Chihuahua",
        enfermedad: "Ninguna",
        estado: "Recuperado",
        edad: 2,
        imagen: "assets/img/jhony.jpg"
    },
    {
        id: 2,
        nombre: "Miguel",
        peso: 8,
        raza: "Poodle",
        enfermedad: "Dermatitis",
        estado: "En tratamiento",
        edad: 4,
        imagen: "assets/img/miguel.jpg"
    },
    {
        id: 3,
        nombre: "Pablo",
        peso: 20,
        raza: "Labrador",
        enfermedad: "Fractura de pata",
        estado: "Recuperado",
        edad: 3,
        imagen: "assets/img/pablo.jpg"
    },
    {
        id: 4,
        nombre: "Lucas",
        peso: 10,
        raza: "Beagle",
        enfermedad: "Problema respiratorio",
        estado: "En observación",
        edad: 5,
        imagen: "assets/img/lucas.jpg"
    },
    {
        id: 5,
        nombre: "Zeus",
        peso: 12,
        raza: "Bulldog Francés",
        enfermedad: "Ninguna",
        estado: "En tratamiento",
        edad: 1,
        imagen: "assets/img/Zeus.jpg"
    }
];

findAll(): mascota[] {
  //return this.http.get<mascota[]>('http://localhost:8080/mascotas/all');
    return this.mascotaList;}

  findById(id: number): mascota {
    const mascotaEncontrada = this.mascotaList.find(mascota => mascota.id === id);
    if (!mascotaEncontrada) {
        throw new Error(`Mascota con id ${id} no encontrada`);
    }
    return mascotaEncontrada;
  }

  findClienteMascota(id: number): Observable<mascota[]> {
    return of(this.mascotaList.filter(mascota => mascota.id === id));
  }

  updateMascota(updatedMascota: mascota): Observable<mascota> {
    const index = this.mascotaList.findIndex(m => m.id === updatedMascota.id);
    if (index !== -1) {
      this.mascotaList[index] = updatedMascota;
      return of(this.mascotaList[index]);
    }
    return of(undefined as any);
  }

  addMascota(nuevaMascota: mascota) {
    this.mascotaList.push(nuevaMascota);
  }
}