package com.example.demo.Repositories;

import com.example.demo.Entidades.Encuesta;
import com.example.demo.Entidades.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    Optional<Pregunta> findById(int preguntaId);

}
