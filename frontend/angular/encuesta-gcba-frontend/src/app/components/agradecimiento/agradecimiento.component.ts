import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-agradecimiento',
  standalone: true,
  imports: [],
  templateUrl: './agradecimiento.component.html',
  styleUrl: './agradecimiento.component.css'
})
export class AgradecimientoComponent {

  constructor(private router: Router) {


  }

  volverLogin() {
    this.router.navigate(["encuesta/login"]);
  }
}
