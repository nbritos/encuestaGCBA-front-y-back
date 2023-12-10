import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Encuesta } from '../components/models/encuestaModel'; // Asegúrate de poner la ruta correcta a tu modelo

@Injectable({
    providedIn: 'root'
})
export class EncuestaService {
    private apiUrl = 'http://localhost:8080/api/encuesta';

    constructor(private http: HttpClient) { }

    enviarEncuesta(encuesta: Encuesta): Observable<any> {
        const url = `${this.apiUrl}/responder`; 
        return this.http.post(url, encuesta);
    }
}
