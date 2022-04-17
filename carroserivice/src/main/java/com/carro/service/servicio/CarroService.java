package com.carro.service.servicio;

import java.util.List;

import com.carro.service.entidad.Carro;


import com.carro.service.repositorio.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired/* inyeccion de repositorio */
    private CarroRepository carroRepository;

    public List<Carro> getAll() {
		return carroRepository.findAll();
	}

	public Carro getCarroById(int id) {
		return carroRepository.findById(id).orElse(null);
	}

	public Carro save(Carro usuario) {
		Carro nuevoCarro = carroRepository.save(usuario);
		return nuevoCarro;
	}

    public List<Carro> byUsuarioId(int usuarioId){/* buscar carros por id */
        return carroRepository.findByUsuarioId(usuarioId);
    }
}
