package com.example.demo.Controladores;

import com.example.demo.Servicios.EncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/encuesta")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EncuestaController {
    private static final Logger logger = Logger.getLogger(EncuestaService.class.getName());

    @Autowired
    private EncuestaService encuestaService;

    @PostMapping("/responder")
    public ResponseEntity<String> responderPregunta(@RequestBody Map<String, Object> data) {
        try {
            int preguntaId = (int) data.get("pregunta_id");
            int respuestaSeleccionada = (int) data.get("respuestaSeleccionada");
            logger.info(String.format("creo la respuesta con valor de pregunta_id: %d.", preguntaId));
            logger.info(String.format("creo la respuesta con valor de respuestaSeleccionada: %d.", respuestaSeleccionada));


            encuestaService.responderPregunta(preguntaId, respuestaSeleccionada);
            return ResponseEntity.status(HttpStatus.CREATED).body("Respuesta guardada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al guardar la respuesta.");
        }
    }
}
