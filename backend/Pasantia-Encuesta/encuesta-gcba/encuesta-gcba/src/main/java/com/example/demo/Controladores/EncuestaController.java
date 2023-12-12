package com.example.demo.Controladores;

import com.example.demo.Entidades.Encuesta;
import com.example.demo.Servicios.EncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/encuesta")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EncuestaController {

    @Autowired
    private EncuestaService encuestaService;

    @PostMapping("/crear")
    public ResponseEntity<String> crearEncuesta(@RequestBody Encuesta encuesta) {
        try {
            // Lógica para procesar y guardar la encuesta en el servicio
            encuestaService.procesarEncuesta(encuesta);

            Map<String, String> response = new HashMap<>();
            response.put("message", "Encuesta creada exitosamente");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.toString());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}

