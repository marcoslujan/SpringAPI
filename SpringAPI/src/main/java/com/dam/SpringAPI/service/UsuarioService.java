package com.dam.SpringAPI.service;

import com.dam.SpringAPI.model.Usuario;
import com.dam.SpringAPI.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository repo;
    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<Usuario> listar(){
        return repo.findAll();
    }

    public Usuario guardar(Usuario u){
        return repo.save(u);
    }
    public Optional<Usuario> buscarPorId(Long id){
        return repo.findById(id);
    }
    public void eliminar(Long id){
        repo.deleteById(id);
    }
}
