package com.act1.backend.act1_backend.controllers;

import com.act1.backend.act1_backend.entity.categoria;
import com.act1.backend.act1_backend.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CategoriaRestController {

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/categorias")
    public List<categoria> index(){
        return categoriaService.findAll();
    }

    @GetMapping("/categorias/{cat_idcat}")
    @ResponseStatus(HttpStatus.OK)
    public categoria show(@PathVariable Integer cat_idcat){
        return categoriaService.findById(cat_idcat);
    }

    @PostMapping("/categorias")
    @ResponseStatus(HttpStatus.CREATED)
    public categoria create(@RequestBody categoria categoria){
        return categoriaService.save(categoria);
    }

    @PutMapping("/categorias/{cat_idcat}")
    @ResponseStatus(HttpStatus.CREATED)
    public categoria update(@RequestBody categoria categoria, @PathVariable Integer cat_idcat){
        categoria categoriaActual = categoriaService.findById(cat_idcat);

        categoriaActual.setCat_nomcat(categoria.getCat_nomcat());
        categoriaActual.setCat_descat(categoria.getCat_descat());

        return categoriaService.save(categoriaActual);
    }

    @DeleteMapping("/categorias/{cat_idcat}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<String> delete(@PathVariable Integer cat_idcat){
        categoriaService.delete(cat_idcat);

        return ResponseEntity.ok("La categoría con id: " + cat_idcat + " ha sido eliminada con éxito!");
    }
}
