package com.example.demo.Servicios;

import com.example.demo.Entidades.Encuesta;
import com.example.demo.Entidades.Pregunta;
import com.example.demo.Entidades.Respuesta;
import com.example.demo.Excepciones.CustomDataAccessException;
import com.example.demo.Repositories.EncuestaRepository;
import com.example.demo.Repositories.PreguntaRepository;
import com.example.demo.Repositories.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncuestaService {
    @Autowired
    private RespuestaRepository respuestaRepository;
    @Autowired
    private PreguntaRepository preguntaRepository; // Asegúrate de que se inyecte el repositorio correcto

    public void responderPregunta(int respuestaSeleccionada) {
        // Obtener la pregunta predeterminada (supongamos que tiene el ID 1)
        Pregunta pregunta = preguntaRepository.findById(3).orElse(null);

        if (pregunta != null) {
            // Crear una nueva respuesta con el valor seleccionado y la pregunta predeterminada
            Respuesta respuesta = new Respuesta();
            respuesta.setValorRespuesta(respuestaSeleccionada);
            respuesta.setPregunta(pregunta);

            // Guardar la respuesta en la base de datos
            respuestaRepository.save(respuesta);
        } else {
            // Manejar el caso donde la pregunta predeterminada no existe
        }
    }
}