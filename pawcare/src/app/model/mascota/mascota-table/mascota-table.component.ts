import { Component } from '@angular/core';
import { mascota } from '../mascota';

@Component({
  selector: 'app-mascota-table',
  templateUrl: './mascota-table.component.html',
  styleUrls: ['./mascota-table.component.css']
})

export class MascotaTableComponent {
  selectedMascota!: mascota;

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
  
  //Metodos
  mostrarMascota(mascota: mascota) {
    this.selectedMascota = mascota;
  }
  
  eliminarMascota(mascota: mascota) {
    var index = this.mascotaList.indexOf(mascota);
    this.mascotaList.splice(index, 1);
  }

  agregarMascota(mascota: mascota) {
    this.mascotaList.push(mascota);
  }
}
