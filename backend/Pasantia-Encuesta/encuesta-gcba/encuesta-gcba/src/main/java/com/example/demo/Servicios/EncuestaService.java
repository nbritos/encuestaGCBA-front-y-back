package com.example.demo.Servicios;

import com.example.demo.Entidades.Encuesta;
import com.example.demo.Repositories.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@Service
public class EncuestaService {
    private static final Logger logger = Logger.getLogger(EncuestaService.class.getName());

    @Autowired
    private EncuestaRepository encuestaRepository;

    public void procesarEncuesta(Encuesta encuesta) {
        logger.info("Inicia código del servicio para procesar la encuesta");

        // Guarda la encuesta en la base de datos
        Encuesta encuestaGuardada = encuestaRepository.save(encuesta);

        logger.info("Encuesta procesada y guardada exitosamente");
    }
}
