package com.carro.service.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.carro.service.entidad.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{
    List<Carro>findByUsuarioId(int usuarioId);
}
