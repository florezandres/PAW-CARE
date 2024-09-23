import { Component, EventEmitter, Output } from '@angular/core';
import { mascota } from '../mascota';
import { lastValueFrom } from 'rxjs';
import { MascotaService } from 'src/app/service/mascota.service';

@Component({
  selector: 'app-mascota-form',
  templateUrl: './mascota-form.component.html',
  styleUrls: ['./mascota-form.component.css']
})
export class MascotaFormComponent {

  @Output()
  addMascotaEvent = new EventEmitter<mascota>();

  sendMascota!: mascota;

  formMascota: mascota = {
    id: 999,
    nombre: '',
    peso: 0,
    raza: '',
    enfermedad: '',
    estado: '',
    edad: 0,
    imagen: ''
  }

  addMascota() {
    console.log(this.formMascota);
    this.sendMascota = Object.assign({}, this.formMascota);
    this.addMascotaEvent.emit(this.sendMascota); 
  }

  addMasc(form:any) {
    console.log(this.formMascota);
    this.sendMascota = Object.assign({}, this.formMascota);
    this.addMascotaEvent.emit(this.sendMascota); 
  }

}
