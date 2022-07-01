package com.act1.backend.act1_backend.dao;

import com.act1.backend.act1_backend.entity.producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository<producto, Integer> {
}

