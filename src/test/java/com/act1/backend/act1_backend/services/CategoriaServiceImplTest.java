package com.act1.backend.act1_backend.services;

import com.act1.backend.act1_backend.dao.ICategoriaDao;
import com.act1.backend.act1_backend.entity.categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class CategoriaServiceImplTest {

    @Mock
    private ICategoriaDao categoriaDao;

    @InjectMocks
    private CategoriaServiceImpl categoriaService;

    private categoria categoria;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        categoria = new categoria();
        categoria.setCat_idcat(2);
        categoria.setCat_nomcat("Categoría desde prueba unitaria");
        categoria.setCat_descat("Agregar una descripción aquí.");

    }

    @Test
    void findAll() {

        when(categoriaDao.findAll()).thenReturn(Arrays.asList(categoria));
        assertNotNull(categoriaService.findAll());
    }

    @Test
    void findById() {

        categoria = new categoria();
        categoria.setCat_idcat(2);
        categoria.setCat_nomcat("Categoría desde prueba unitaria");
        categoria.setCat_descat("Agregar una descripción aquí.");

        assertNotNull(categoriaDao.findById(2));
    }

    @Test
    void save() {
        categoria = new categoria();
        categoria.setCat_nomcat("Categoría desde prueba unitaria desde el save");
        categoria.setCat_descat("Agregar una descripción aquí.");

        when(categoriaDao.save(any(categoria.class))).thenReturn(categoria);
        assertNotNull(categoriaService.save(categoria));
    }

    @Test
    void delete() throws Exception {

        int categoria_id = 2;

        //doThrow(new Exception()).when(categoriaDao).deleteById(categoria_id);

        //perform the call
        categoriaService.delete(categoria_id);

        //verify the mocks
        verify(categoriaDao, times(1)).deleteById(categoria_id);
    }
}