package com.tanos.loteria.controller;

import com.tanos.loteria.model.Sorteo;
import com.tanos.loteria.service.SorteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sorteo")
public class SorteoController {

    @Autowired
    @Qualifier("service")
    SorteoService sorteoService;

    @PostMapping
    public Sorteo save(@RequestBody Sorteo sorteo){
        return sorteoService.save(sorteo);
    }
    @GetMapping
    public List<Sorteo> findAll(){
        return sorteoService.findAll();
    }
}
