import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Usuario } from '../components/models/usuarioModel';

@Injectable({
  providedIn: 'root'
})

export class UsuariosService {

  API_URI = 'http://localhost:8080/api/usuario';

  constructor(private http: HttpClient) { }

  loginUsuario(usuario: Usuario) {
    return this.http.get(`${this.API_URI}/documento/${usuario.documento}`);
  }

  setToken(token: string) {
    localStorage.setItem('token', token);
  }

  getToken() {
    return localStorage.getItem('token');
  }

  isLoggedIn(): Boolean {
    return !!localStorage.getItem('token');
  }

  logOut() {
    localStorage.removeItem('token');
  }
}
