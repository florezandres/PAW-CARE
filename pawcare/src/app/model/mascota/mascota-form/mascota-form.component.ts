import { Component, EventEmitter, Output } from '@angular/core';
import { mascota } from '../mascota';
import { lastValueFrom } from 'rxjs';
import { MascotaService } from 'src/app/service/mascota.service';
import { Router, RouterLink } from '@angular/router';

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
    id: 0,
    nombre: '',
    peso: '',
    raza: '',
    enfermedad: '',
    estado: '',
    edad: 1,
    imagen: ''
  }

  constructor(private mascotaService: MascotaService,
              private router: Router
  )
   {
   }

   ngOnInit(): void {
    this.mascotaService.findAll().subscribe(
      (mascotas) => {
        this.mascotaList = mascotas;
      }
    );
  }
  addMascota() {
    if (this.validarFormulario()) {
      this.mascotaList.push(this.formMascota);
      this.mascotaService.addMascota(this.formMascota);
      this.formMascota.id = this.mascotaList.length + 1;
      this.router.navigate(['/mascotas']);
    }
    else {
      alert('Todos los campos marcados con * son obligatorios');
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
