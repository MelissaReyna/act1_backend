package com.act1.backend.act1_backend.services;

import com.act1.backend.act1_backend.dao.IProductoDao;
import com.act1.backend.act1_backend.entity.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private IProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<producto> findAll() {
        return (List<producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public producto findById(Integer pro_idpro) {
        return productoDao.findById(pro_idpro).orElse(null);
    }

    @Override
    @Transactional
    public producto save(producto producto) {
        return productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Integer pro_idpro) {
        productoDao.deleteById(pro_idpro);
    }

}
