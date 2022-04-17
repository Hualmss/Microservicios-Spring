package com.moto.service.service;

import java.util.List;

import com.moto.service.entidad.Moto;
import com.moto.service.repository.MotoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoService {

    
    @Autowired/* inyeccion de repositorio */
    private MotoRepository motoRepository;


    public List<Moto> getAll() {
		return motoRepository.findAll();
	}

	public Moto getMotoById(int id) {
		return motoRepository.findById(id).orElse(null);
	}

	public Moto save(Moto usuario) {
		Moto nuevoMoto = motoRepository.save(usuario);
		return nuevoMoto;
	}

    public List<Moto> byUsuarioId(int usuarioId){/* buscar motos por id */
        return motoRepository.findByUsuarioId(usuarioId);
    }

    
}
