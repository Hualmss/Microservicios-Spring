package com.moto.service.repository;

import java.util.List;

import com.moto.service.entidades.Moto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MotoRepository extends JpaRepository<Moto, Integer>{
    List<Moto>findByUduarioId(int usuarioId);/* un usuario podra tener muchas motos */
}

