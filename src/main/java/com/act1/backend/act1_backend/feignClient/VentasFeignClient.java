package com.act1.backend.act1_backend.feignClient;

import com.act1.backend.act1_backend.entity.producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ventas-service", url = "http://localhost:8080/api")
public interface VentasFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/productos")
    List<producto> getVentas();
}
