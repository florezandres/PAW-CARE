import { Component } from '@angular/core';
import { mascota } from '../mascota';
import { MascotaService } from 'src/app/service/mascota.service';

@Component({
  selector: 'app-mascota-table',
  templateUrl: './mascota-table.component.html',
  styleUrls: ['./mascota-table.component.css']
})

export class MascotaTableComponent {
  selectedMascota!: mascota;


  mascotaList: mascota[] = [];

  constructor(private mascotaService: MascotaService) { }

  //Metodos
  ngOnInit(): void {
    this.mascotaService.findAll().subscribe(
      (mascotas) => {
        this.mascotaList = mascotas;
      }
    );
  }

  mostrarMascota(mascota: mascota) {
    this.selectedMascota = mascota;
  }
  
  eliminarMascota(mascota: mascota) {
    var index = this.mascotaList.indexOf(mascota);
    this.mascotaList.splice(index, 1);
    this.mascotaService.deleteMascota(mascota.id);
  }

  agregarMascota(mascota: mascota) {
    this.mascotaList.push(mascota);
    this.mascotaService.addMascota(mascota);
  }
}
