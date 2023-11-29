package com.tanos.loteria.service;

import com.tanos.loteria.DTO.SorteoDTO;
import com.tanos.loteria.model.Sorteo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaSorteoService {

    public Sorteo crearSorteo(SorteoDTO sorteoDTO){
        return new Sorteo(sorteoDTO);
    }

    public SorteoDTO crearSorteoDto(Sorteo sorteo){
        return new SorteoDTO(sorteo);
    }

    public List<SorteoDTO> crearSorteosDto(List<Sorteo> sorteos){
        List<SorteoDTO> sorteoDTOS = new ArrayList<>();
        sorteos.stream().forEach(sorteo -> {
            sorteoDTOS.add(crearSorteoDto(sorteo));
        });
        return sorteoDTOS;
    }
}
