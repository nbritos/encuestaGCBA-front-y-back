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

    /*enviarEncuesta(encuesta: Encuesta) {
        return this.http.post<any>(`${this.apiUrl}/crear`, encuesta).subscribe(
            (res: any) => {
                console.log(JSON.stringify(encuesta));
                console.log('respuesta del back: ', res);
                // if (res && res.status === 'OK') {
                //     console.log('respuesta enviada correctamente0');
                // } else {
                //     console.error('Error en el backend');
                // }

            }, (error :any) => {
                console.error('Error al agregar encuesta', error);
            }
        );
    }*/
    enviarEncuesta(encuesta: Encuesta) {
        return this.http.post<any>(`${this.apiUrl}/crear`, encuesta).subscribe(
            (res: any) => {
                console.log(JSON.stringify(encuesta));
                console.log('respuesta del back: ', res);
            },
            (error: any) => {
                console.error('Error al agregar encuesta', error);
                if (error.error instanceof ErrorEvent) {
                    // Error del lado del cliente
                    console.error('Error del lado del cliente:', error.error.message);
                } else {
                    // Error del lado del servidor
                    console.error('Error del lado del servidor:', error.error);
                }
            }
        );
    }
    
}
