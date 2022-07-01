package com.act1.backend.act1_backend.controllers;

import com.act1.backend.act1_backend.entity.producto;
import com.act1.backend.act1_backend.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductoRestController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/productos")
    public List<producto> index() {
        return productoService.findAll();
    }

    @GetMapping("/productos/{pro_idpro}")
    @ResponseStatus(HttpStatus.OK)
    public producto show(@PathVariable Integer pro_idpro) {
        return productoService.findById(pro_idpro);
    }

    @PostMapping("/productos")
    @ResponseStatus(HttpStatus.CREATED)
    public producto create(@RequestBody producto producto) {
        return productoService.save(producto);
    }

    @PutMapping("/productos/{pro_idpro}")
    @ResponseStatus(HttpStatus.CREATED)
    public producto update(@RequestBody producto producto, @PathVariable Integer pro_idpro) {
        producto productoActual = productoService.findById(pro_idpro);

        productoActual.setPro_nompro(producto.getPro_nompro());
        productoActual.setPro_despro(producto.getPro_despro());
        productoActual.setPro_prepro(producto.getPro_prepro());
        productoActual.setPro_cantpro(producto.getPro_cantpro());

        return productoService.save(productoActual);
    }

    @DeleteMapping("/productos/{pro_idpro}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<String> delete(@PathVariable Integer pro_idpro) {
        productoService.delete(pro_idpro);

        return ResponseEntity.ok("El producto con id: " + pro_idpro + " ha sido eliminado con éxito!");
    }
}
