package com.tanos.loteria.controller;

import com.tanos.loteria.DTO.SorteoDTO;
import com.tanos.loteria.model.Sorteo;
import com.tanos.loteria.service.SorteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sorteo")
public class SorteoController {

    @Autowired
    @Qualifier("service")
    SorteoService sorteoService;

    @PostMapping
    public SorteoDTO save(@RequestBody SorteoDTO sorteoDTO){
        return sorteoService.save(sorteoDTO);
    }

    @PostMapping("/saveall")
    public List<SorteoDTO> saveAll(@RequestBody List<SorteoDTO> sorteoDTOS){
        return sorteoService.saveAll(sorteoDTOS);
    }

    @GetMapping
    public List<SorteoDTO> findAll(){
        return sorteoService.findAll();
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteSorteo() {
        try
        {
            sorteoService.deleteAll();
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
