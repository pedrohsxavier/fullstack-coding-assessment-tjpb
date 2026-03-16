package com.backend.ms.service;

import com.backend.ms.model.Usuario;
import com.backend.ms.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario criar(Usuario usuario) {
        usuario.setDataCriacao(LocalDateTime.now()); // Definir a data de criação
        return repository.save(usuario);
    }
}