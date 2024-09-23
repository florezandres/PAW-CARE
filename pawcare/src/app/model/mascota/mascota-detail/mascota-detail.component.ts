import { Component, Input } from '@angular/core';
import { mascota } from '../mascota';

@Component({
  selector: 'app-mascota-detail',
  templateUrl: './mascota-detail.component.html',
  styleUrls: ['./mascota-detail.component.css']
})
export class MascotaDetailComponent {

  @Input()
  mascota!: mascota;
}
