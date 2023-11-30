package com.tanos.loteria.service;

import com.tanos.loteria.DTO.SorteoDTO;
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

    @Autowired
    FabricaSorteoService fabricaSorteoService;

    public SorteoDTO save(SorteoDTO sorteoDTO){
        return fabricaSorteoService.crearSorteoDto(sorteoRepository.save(fabricaSorteoService.crearSorteo(sorteoDTO)));
    }

    public List<SorteoDTO> findAll(){
        return fabricaSorteoService.crearSorteosDto(sorteoRepository.findAll());
    }

}
