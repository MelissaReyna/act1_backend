package com.act1.backend.act1_backend.services;

import com.act1.backend.act1_backend.entity.categoria;

import java.util.List;

public interface ICategoriaService {

    public List<categoria> findAll();

    public categoria findById(Integer id);

    public categoria save(categoria categoria);

    public void delete(Integer id);

}
