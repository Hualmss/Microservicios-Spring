package com.usuario.service.feignClient;

import java.util.List;

import com.usuario.service.Models.Carro;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/* con feign client se indica que este es un clientefeing, se indica el nombre carro-service y la url
acase puede accceder a los metodos get post y se idica el request mapping */
@FeignClient(name = "carroserivice", url = "http://localhost:8002/carro")/* TAMBIEN SE PUEDE CAMBIAR URL POR PATH O ALGO ASI */
public interface CarroFeignClient {
    /*  con Rest se inyecta en el IOC container luego llamar con el servicio,
    aca solo  añadimos un starter y creamos una interfacz con la notacion feign */
    @PostMapping
    public Carro save(@RequestBody Carro carro);

    @GetMapping("/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId );

    
}
