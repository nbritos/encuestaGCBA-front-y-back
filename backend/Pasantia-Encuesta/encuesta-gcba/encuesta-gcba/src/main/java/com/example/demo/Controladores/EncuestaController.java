package com.example.demo.Controladores;

import com.example.demo.Servicios.EncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/encuesta")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EncuestaController {
    @Autowired
    private EncuestaService encuestaService;

    @PostMapping("/responder")
    public ResponseEntity<String> responderPregunta(@RequestBody Map<String, Object> data) {
        int respuestaSeleccionada = (int) data.get("respuestaSeleccionada");

        try {
            encuestaService.responderPregunta(respuestaSeleccionada);
            return ResponseEntity.status(HttpStatus.CREATED).body("Respuesta guardada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al guardar la respuesta.");
        }
    }
}