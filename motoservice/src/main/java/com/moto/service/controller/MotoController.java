package com.moto.service.controller;

import java.util.List;

import com.moto.service.entidad.Moto;
import com.moto.service.service.MotoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/moto")
public class MotoController {

    @Autowired
    private MotoService motoService;



    @GetMapping
	public ResponseEntity<List<Moto>> listarMotos(){
		List<Moto> moto = motoService.getAll();
		if(moto.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(moto);
	}

    @GetMapping("/{id}")
	public ResponseEntity<Moto> obtenerMoto(@PathVariable("id") int id){
		Moto moto = motoService.getMotoById(id);
		if(moto == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(moto);
	}

    @PostMapping
	public ResponseEntity<Moto> guardarMoto(@RequestBody Moto moto){
		Moto nuevoMoto = motoService.save(moto);
		return ResponseEntity.ok(nuevoMoto);
	}


    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity <List<Moto>> listarMotosPorUsuarioId(@PathVariable("usuarioId") int id){
        List <Moto>motos = motoService.byUsuarioId(id);
        if(motos.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
        return ResponseEntity.ok(motos);

    }
}