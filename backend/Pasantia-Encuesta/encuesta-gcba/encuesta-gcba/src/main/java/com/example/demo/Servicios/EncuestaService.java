package com.example.demo.Servicios;

import com.example.demo.Entidades.Pregunta;
import com.example.demo.Entidades.Respuesta;
import com.example.demo.Repositories.PreguntaRepository;
import com.example.demo.Repositories.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@Service
public class EncuestaService {
    private static final Logger logger = Logger.getLogger(EncuestaService.class.getName());
    @Autowired
    private RespuestaRepository respuestaRepository;
    @Autowired
    private PreguntaRepository preguntaRepository;

    public void responderPregunta(int preguntaId, int respuestaSeleccionada) {
        logger.info("Inicia código del servicio");
        // Obtén la pregunta usando el ID proporcionado como parámetro
        Pregunta pregunta = preguntaRepository.findById(preguntaId).orElse(null);

        if (pregunta != null) {
            // Crea una nueva respuesta con el valor seleccionado y la pregunta obtenida
            logger.info("Si pregunta != null...");
            Respuesta respuesta = new Respuesta();
            respuesta.setValorRespuesta(respuestaSeleccionada);
            respuesta.setPregunta(pregunta);

            // Guarda la respuesta en la base de datos
            respuestaRepository.save(respuesta);
            logger.info("Respuesta guardada!!!");
        } else {
            // Manejar el caso donde la pregunta no existe
        }
    }

}