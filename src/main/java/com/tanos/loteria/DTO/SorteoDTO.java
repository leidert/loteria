package com.tanos.loteria.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tanos.loteria.model.Sorteo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

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
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date fechaSorteo;

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
