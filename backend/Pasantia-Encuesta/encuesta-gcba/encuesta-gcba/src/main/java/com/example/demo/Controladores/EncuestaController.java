package com.example.demo.Controladores;

import com.example.demo.Entidades.Encuesta;
import com.example.demo.Servicios.EncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/encuesta")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EncuestaController {

    @Autowired
    private EncuestaService encuestaService;

    @PostMapping("/responder")
    public ResponseEntity<String> responderEncuesta(@RequestBody Encuesta encuesta) {
        try {
            // Puedes acceder a los campos de la encuesta directamente desde el objeto encuesta
            // por ejemplo, encuesta.getMail(), encuesta.getLugarDeResidencia(), etc.

            // Lógica para procesar la encuesta en el servicio
            encuestaService.procesarEncuesta(encuesta);

            return ResponseEntity.status(HttpStatus.CREATED).body("Encuesta guardada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al guardar la encuesta.");
        }
    }
}
