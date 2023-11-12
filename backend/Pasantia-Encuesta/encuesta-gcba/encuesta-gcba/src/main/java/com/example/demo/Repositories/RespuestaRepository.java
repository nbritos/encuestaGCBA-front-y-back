package com.example.demo.Repositories;

import com.example.demo.Entidades.Respuesta;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    // No es necesario definir un método save, ya que JpaRepository proporciona métodos CRUD por defecto.
}

