import { Component, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ClienteService } from 'src/app/service/cliente.service';
import { cliente } from '../cliente';
import { MascotaService } from 'src/app/service/mascota.service';
import { mergeMap } from 'rxjs';
import { Observable, } from 'rxjs';
import { mascota } from '../../mascota/mascota';

@Component({
  selector: 'app-cliente-detail',
  templateUrl: './cliente-detail.component.html',
  styleUrls: ['./cliente-detail.component.css']
})
export class ClienteDetailComponent {

  @Input()
  cliente!: cliente;

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


  constructor(private clienteService: ClienteService,
              private route: ActivatedRoute,
              private router: Router,
              private mascotaService: MascotaService
  ) { 
    this.route.paramMap.subscribe(params => {
      const id = Number(params.get('id'));
      this.cliente = this.clienteService.findById(id);
      if (!this.cliente) {
        this.router.navigate(['/clientes']);
      }
    })
  }

  //Metodos

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      /*
      const id = Number(params.get('id'));
      this.clienteService.findById(id).pipe(
        mergeMap(
          (ClienteInfo) => this.mascotaService.findClienteMascota(this.cliente.id)
        )
      ).subscribe(
        (mascotas) => {
          this.cliente.mascotas = mascotas;
        }
      )*/
    })
      
  }

  
}
