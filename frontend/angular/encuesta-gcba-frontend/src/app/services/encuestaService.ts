import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class EncuestaService {

    constructor() { }

    enviarEncuesta(){
        console.log("enviando encuesta al back");
    }
}