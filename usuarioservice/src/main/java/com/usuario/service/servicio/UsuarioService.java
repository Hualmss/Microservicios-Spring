package com.usuario.service.servicio;

import java.util.List;

import com.usuario.service.Models.Carro;
import com.usuario.service.Models.Moto;
import com.usuario.service.entity.Usuario;
import com.usuario.service.repositorio.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UsuarioService {


	/* Ahora inyectamos lo que se ha guardadao en el IOC container */

	@Autowired
	private RestTemplate restTemplate;

	public List<Carro> getCarros (int usuarioId){
		List<Carro> carros = restTemplate.getForObject("http://localhost:8002/carro/usuario/"+usuarioId, List.class);
		return carros;
		/* para poder acceder al microservicio con rest template se pone la url */

	}
	public List<Moto> getMotos (int usuarioId){
		List<Moto> motos = restTemplate.getForObject("http://localhost:8003/moto/usuario/"+usuarioId, List.class);
		return motos;
		/* para poder acceder al microservicio con rest template se pone la url */

	}


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
