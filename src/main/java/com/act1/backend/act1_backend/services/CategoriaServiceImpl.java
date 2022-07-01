package com.act1.backend.act1_backend.services;

import com.act1.backend.act1_backend.dao.ICategoriaDao;
import com.act1.backend.act1_backend.entity.categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private ICategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<categoria> findAll(){
        return (List<categoria>) categoriaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public categoria findById(Integer cat_idcat) {
        return categoriaDao.findById(cat_idcat).orElse(null);
    }

    @Override
    @Transactional
    public categoria save(categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Integer cat_idcat) {
        categoriaDao.deleteById(cat_idcat);
    }
}
