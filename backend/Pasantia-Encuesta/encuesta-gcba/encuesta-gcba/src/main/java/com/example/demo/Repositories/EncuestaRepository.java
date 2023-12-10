package com.example.demo.Repositories;

import com.example.demo.Entidades.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Integer> {
    // Puedes agregar métodos personalizados según tus necesidades

    // No es necesario agregar un método para guardar, ya que JpaRepository proporciona uno por defecto
}
