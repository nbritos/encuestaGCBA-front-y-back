package com.example.demo.Repositories;

import com.example.demo.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;

//chatgpt:
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //select
    Optional<Usuario> findByDocumento(String documento);
    Usuario save(Usuario usuario);

}

