package com.act1.backend.act1_backend.services;

import com.act1.backend.act1_backend.entity.producto;

import java.util.List;

public interface IProductoService {

    public List<producto> findAll();

    public producto findById(Integer id);

    public producto save(producto producto);

    public void delete(Integer id);


}
