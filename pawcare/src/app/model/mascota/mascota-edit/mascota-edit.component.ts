import { Component, Input } from '@angular/core';
import { mascota } from '../mascota';
import { MascotaService } from 'src/app/service/mascota.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-mascota-edit',
  templateUrl: './mascota-edit.component.html',
  styleUrls: ['./mascota-edit.component.css']
})
export class MascotaEditComponent {

  @Input()
  mascota!: mascota;

  constructor(private mascotaService: MascotaService,
              private route: ActivatedRoute,
              private router: Router
  ) {
    this.route.paramMap.subscribe(params => {
      const id = Number(params.get('id'));
      this.mascota = this.mascotaService.findById(id);
      if (!this.mascota) {
        this.router.navigate(['/mascotas']);
      }
    });
  }

  ngOnInit(): void {
    console.log("ngOnInit de Edit");
  }

  guardarCambios() {
    this.mascotaService.updateMascota(this.mascota).subscribe(() => {
      console.log("Cambios guardados");
      this.router.navigate(['/mascotas']);
    });
  }

  cancelar() {
    this.router.navigate(['/mascotas']);
  }
}
