package com.example.demo.Repositories;

import com.example.demo.Entidades.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Integer> {
    Optional<Encuesta> findById(int encuestaId);
}