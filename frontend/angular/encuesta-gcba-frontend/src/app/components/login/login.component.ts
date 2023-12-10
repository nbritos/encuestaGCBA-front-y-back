import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from '../models/usuarioModel';
import { UsuariosService } from '../../services/usuarios.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule, HttpClientModule, CommonModule],
  providers: [UsuariosService],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})

export class LoginComponent implements OnInit {

  nuevo: Usuario = {};
  mensajeError: string = "";

  constructor(private router: Router, private usuarioService: UsuariosService) {
    this.nuevo.documento = "";
  }

  ngOnInit(): void {
  }

  validarDNI() {
    console.log("validando sesión");
    this.usuarioService.loginUsuario(this.nuevo).subscribe(
      (res: any) => {
        console.log(res);
        if (res) {
          console.log("login exitoso");
          this.usuarioService.setToken(res.token);
          console.log(res.token);
          this.router.navigate(['encuesta/responder'])
        }
      },
      (error: any) => {
        console.error(error);
        if (error.status === 404) {
          this.mensajeError = "Documento no encontrado.";
        } else {
          this.mensajeError = "Error en el servidor. Inténtelo nuevamente.";
        }
      }
    );
    return false;
  }

  ingresar() {
    this.router.navigate(["encuesta/responder"]);
  }
}
