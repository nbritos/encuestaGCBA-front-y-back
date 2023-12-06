import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from '../models/usuarioModel';
import { UsuariosService } from '../../services/usuarios.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,HttpClientModule],
  providers:[UsuariosService],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})

export class LoginComponent implements OnInit {

  nuevo: Usuario = {};

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
        if (res.login == "ok") {
          console.log("login exitoso");
          this.usuarioService.setToken(res.token);
          console.log(res.token);
          this.router.navigate(['encuesta/responder'])
        }
      }
    );
    return false;
  }

  ingresar() {
    this.router.navigate(["encuesta/responder"]);
  }
}
