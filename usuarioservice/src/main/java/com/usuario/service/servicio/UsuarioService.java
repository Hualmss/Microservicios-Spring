package com.usuario.service.servicio;

import java.util.List;

import com.usuario.service.entity.Usuario;
import com.usuario.service.repositorio.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    @Autowired
	private UsuarioRepositorio usuarioRepository;
    
	public List<Usuario> getAll() {
		return usuarioRepository.findAll();
	}

	public Usuario getUsuarioById(int id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	public Usuario save(Usuario usuario) {
		Usuario nuevoUsuario = usuarioRepository.save(usuario);
		return nuevoUsuario;
	}

}
