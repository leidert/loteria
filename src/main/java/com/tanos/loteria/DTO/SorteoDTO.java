package com.tanos.loteria.DTO;

import com.tanos.loteria.model.Sorteo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class SorteoDTO {
    private String id;
    private Integer posicionUno;
    private Integer posicionDos;
    private Integer posicionTres;
    private Integer posicionCuatro;
    private Integer posicionCinco;
    private Integer posicionSeis;
    private LocalDate fechaSorteo;

    public SorteoDTO(Sorteo sorteo) {
        this.id = sorteo.getId();
        this.posicionUno = sorteo.getPosicionUno();
        this.posicionDos = sorteo.getPosicionDos();
        this.posicionTres = sorteo.getPosicionTres();
        this.posicionCuatro = sorteo.getPosicionCuatro();
        this.posicionCinco = sorteo.getPosicionCinco();
        this.posicionSeis = sorteo.getPosicionSeis();
        this.fechaSorteo = sorteo.getFechaSorteo();
    }
}
