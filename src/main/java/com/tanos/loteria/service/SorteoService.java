package com.tanos.loteria.service;

import com.tanos.loteria.DTO.SorteoDTO;
import com.tanos.loteria.model.Sorteo;
import com.tanos.loteria.repository.SorteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<SorteoDTO> saveAll(List<SorteoDTO> sorteos){
        List<SorteoDTO> sorteoDTOS = new ArrayList<>();
        sorteos.stream().forEach(sorteoDTO -> {
            sorteoDTOS.add(fabricaSorteoService.crearSorteoDto(sorteoRepository.save(fabricaSorteoService.crearSorteo(sorteoDTO))));
        });
        return sorteoDTOS;
    }
    public void deleteAll(){
        sorteoRepository.deleteAll();
    }

}
