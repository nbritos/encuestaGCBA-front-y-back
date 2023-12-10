package com.example.demo.Controladores;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Servicios.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
    @Autowired
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    // Endpoint para crear un nuevo usuario
    @PostMapping("/crear")
    public ResponseEntity<String> crearUsuario(@RequestBody Usuario usuario) {
        try {
            usuarioService.insertarUsuario(usuario);
            logger.info("Usuario creado exitosamente.");
            return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado exitosamente");
        } catch (Exception e) {
            logger.error("Ocurrió un error al crear usuario: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al crear usuario.");
        }
    }

    // Endpoint para traer un usuario
    @GetMapping("/documento/{documento}")
    public ResponseEntity<?> obtenerUsuarioPorDocumento(@PathVariable String documento) {
        Optional<Usuario> usuario = usuarioService.obtenerUsuarioPorDocumento(documento);

        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado para el documento: " + documento);
        }
    }
}
