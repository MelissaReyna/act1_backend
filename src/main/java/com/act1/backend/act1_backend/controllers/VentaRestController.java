package com.act1.backend.act1_backend.controllers;

import com.act1.backend.act1_backend.entity.producto;
import com.act1.backend.act1_backend.feignClient.VentasFeignClient;
import com.act1.backend.act1_backend.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/ventas")
public class VentaRestController {

    @Autowired
    private VentasFeignClient ventasFeignClient;

    @GetMapping("/productos")
    public List<producto> index() {
        return ventasFeignClient.getVentas();
    }

}
