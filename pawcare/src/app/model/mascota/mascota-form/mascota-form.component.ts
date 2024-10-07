import { Component, EventEmitter, Output } from '@angular/core';
import { mascota } from '../mascota';
import { lastValueFrom } from 'rxjs';
import { MascotaService } from 'src/app/service/mascota.service';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-mascota-form',
  templateUrl: './mascota-form.component.html',
  styleUrls: ['./mascota-form.component.css']
})
export class MascotaFormComponent {

  @Output()
  addMascotaEvent = new EventEmitter<mascota>();

  sendMascota!: mascota;

  mascotaList: mascota[] = [];

  formMascota: mascota = {
    id: this.mascotaList.length + 1,
    nombre: '',
    peso: 1,
    raza: '',
    enfermedad: '',
    estado: '',
    edad: 1,
    imagen: ''
  }

  constructor(private mascotaService: MascotaService)
   {}

   ngOnInit(): void {
    this.mascotaService.findAll().subscribe(
      (mascotas) => {
        this.mascotaList = mascotas;
      }
    );
  }
  addMascota() {
    if (this.validarFormulario()) {
      this.mascotaService.addMascota(this.formMascota);
      
    }
  }
  
  validarFormulario() {
    if (!this.formMascota.nombre || !this.formMascota.peso || !this.formMascota.raza || 
        !this.formMascota.enfermedad || !this.formMascota.estado || !this.formMascota.edad) {
      alert('Todos los campos marcados con * son obligatorios');
      return false;
    }
    return true;
  }
  

  addMasc(form:any) {
    console.log(this.formMascota);
    this.sendMascota = Object.assign({}, this.formMascota);
    this.addMascotaEvent.emit(this.sendMascota); 
  }

}
