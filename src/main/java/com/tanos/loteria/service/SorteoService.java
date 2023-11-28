package com.tanos.loteria.service;

import com.tanos.loteria.model.Sorteo;
import com.tanos.loteria.repository.SorteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
public class SorteoService {

    @Autowired
    @Qualifier("repository")
    SorteoRepository sorteoRepository;

    public Sorteo save(Sorteo sorteo){
        return sorteoRepository.save(sorteo);
    }

    public List<Sorteo> findAll(){
        return sorteoRepository.findAll();
    }

}
