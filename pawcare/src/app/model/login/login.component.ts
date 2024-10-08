import { Component, Input } from '@angular/core';
import { cliente } from '../cliente/cliente';
import { ClienteService } from 'src/app/service/cliente.service';
import { AdministradorService } from 'src/app/service/administrador.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  @Input()
  cliente!: cliente;

  cedula: number = null!;

  constructor(
    private clienteService: ClienteService, 
    private administradorService: AdministradorService,
    private router: Router
  ) { }

  iniciarSesion() {
    if (this.cedula && this.cedula !== 0) {
      this.clienteService.findByCedula(this.cedula).subscribe(
        (clienteEncontrado) => {
          if (clienteEncontrado) {
            // Si se encuentra el cliente, redirigir a la vista de cliente
            this.router.navigate(['/cliente/detail/' + clienteEncontrado.id]);
          } else {
            // Si no se encuentra como cliente, buscar como administrador
            this.buscarComoAdministrador();
          }
        },
        (error) => {
          console.error('Error al buscar el cliente por cédula:', error);
          this.buscarComoAdministrador(); 
        }
      );
    } else {
      alert('Por favor, ingrese una cédula válida.');
    }
  }

  private buscarComoAdministrador() {
    this.administradorService.findByCedula(this.cedula).subscribe(
      (administradorEncontrado) => {
        if (administradorEncontrado) {
          this.router.navigate(['/administrador/dashboard/']);
        } else {
          alert('Cédula no encontrada. Intente de nuevo.'); 
        }
      },
      (error) => {
        console.error('Error al buscar el administrador por cédula:', error);
      }
    );
  }
}
