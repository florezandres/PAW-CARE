import { Injectable } from '@angular/core';
import { cliente } from '../model/cliente/cliente';
import { mascota } from '../model/mascota/mascota';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor() { }

  clienteList: cliente[] = [
    {
      id: 1,
      nombre: 'Luis',
      correo: 'luis@luis',
      cedula: 123456789,
      celular: 123456789,
      mascotas: []
    }
  ]


  findAll(): cliente[] {
    return this.clienteList;
  }

  findById(id: number): cliente {
    const clienteEncontrado = this.clienteList.find(cliente => cliente.id === id);
    if (!clienteEncontrado) {
      throw new Error(`Cliente con id ${id} no encontrado`);
    }
    return clienteEncontrado;
  }

  updateCliente(cliente: cliente) {
    const index = this.clienteList.findIndex(c => c.id === cliente.id);
    if (index === -1) {
      throw new Error(`Cliente con id ${cliente.id} no encontrado`);
    }
    this.clienteList[index] = cliente;
  }
}
