import { Component } from '@angular/core';
import { EncuestaService } from '../../services/encuestaService';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Encuesta } from '../models/encuestaModel'; // Asegúrate de poner la ruta correcta a tu modelo
import { HttpClientModule } from '@angular/common/http';

@Component({
    selector: 'app-encuesta-responder',
    standalone: true,
    imports: [FormsModule, ReactiveFormsModule, CommonModule, HttpClientModule],
    templateUrl: './encuesta-responder.component.html',
    styleUrl: './encuesta-responder.component.css'
})
export class EncuestaResponderComponent {

    form: FormGroup;

    constructor(private encuestaService: EncuestaService, private formB: FormBuilder) {
        this.form = formB.group({
            mail: ['', Validators.required],
            lugarDeResidencia: ['', Validators.required],
            nivelDeEstudios: ['', Validators.required],
            cuatrimestreCodo: ['', Validators.required],
            cursoCodo: ['', Validators.required],
            desempenioCodo: ['', Validators.required],
            continuaEstudiando: ['', Validators.required],
            tipoDeEstudio: ['', Validators.required],
            nivelEnProgramacion: ['', Validators.required],
            situacionLaboral: ['', Validators.required],
            trabajoActual: ['', Validators.required],
            trabajoActualProgramador: ['', Validators.required],
            aceptaBusquedaLaboral: ['', Validators.required]
        });
    }

    enviarEncuesta() {
        if (this.form.valid) {
            const encuesta = this.form.value;

            this.encuestaService.enviarEncuesta(encuesta).subscribe(
                () => {
                    console.log('Encuesta enviada exitosamente desde el front');
                },
                error => {
                    console.error('Error al enviar la encuesta', error);
                }
            );
        } else {
            console.warn('Formulario no válido. Por favor, completa todos los campos.');
        }
    }

    validarCampos() {
        console.log('Validando los campos de la encuesta');
        this.enviarEncuesta();
    }
}
