import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/service/auth.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  @Input()
  userType: string = "noauth";

  constructor(private authService: AuthService) { }

  ngOnInit(): void {
    this.setUserType('noauth');
  }

  ngOnChanges(): void {
  }

  logout(): void {
  }

  setUserType(tipo: string) {
    this.userType = tipo;
  }
}
