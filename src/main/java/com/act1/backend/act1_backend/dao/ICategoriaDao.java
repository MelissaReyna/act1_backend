package com.act1.backend.act1_backend.dao;

import com.act1.backend.act1_backend.entity.categoria;
import org.springframework.data.repository.CrudRepository;

public interface ICategoriaDao extends CrudRepository<categoria, Integer> {

}
