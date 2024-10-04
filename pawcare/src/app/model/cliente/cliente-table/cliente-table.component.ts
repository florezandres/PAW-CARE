import { Component } from '@angular/core';
import { ClienteService } from 'src/app/service/cliente.service';
import { cliente } from '../cliente';

@Component({
  selector: 'app-cliente-table',
  templateUrl: './cliente-table.component.html',
  styleUrls: ['./cliente-table.component.css']
})
export class ClienteTableComponent {

  selectedCliente!: cliente;
  
  clienteList: cliente[] = [];

  constructor(private clienteService: ClienteService) { }

  //Metodos
  ngOnInit(): void {
    this.cargarClientes();
  }

  cargarClientes(): void {
    this.clienteList = this.clienteService.findAll();
  }

  mostrarCliente(cliente: cliente) {
    this.selectedCliente = cliente;
  }

  eliminarCliente(cliente: cliente) {
    var index = this.clienteList.indexOf(cliente);
    this.clienteList.splice(index, 1);
  }

}
