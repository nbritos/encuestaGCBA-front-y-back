import { Component } from '@angular/core';
import { EncuestaService } from '../../services/encuestaService';

@Component({
  selector: 'app-encuesta-responder',
  standalone: true,
  imports: [],
  templateUrl: './encuesta-responder.component.html',
  styleUrl: './encuesta-responder.component.css'
})
export class EncuestaResponderComponent {

  constructor(private encuestaService:EncuestaService) {

  }

  enviarEncuesta(){
    this.encuestaService.enviarEncuesta();
  }

  validarCampos(){
    console.log("validando los campos de la encuesta");
    this.enviarEncuesta();
  }
}
