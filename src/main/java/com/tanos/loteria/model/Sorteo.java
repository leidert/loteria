package com.tanos.loteria.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tanos.loteria.DTO.SorteoDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;


@Data
@NoArgsConstructor
@Document(collection = "sorteo")
public class Sorteo {

    @Id
    private String id;
    private Integer posicionUno;
    private Integer posicionDos;
    private Integer posicionTres;
    private Integer posicionCuatro;
    private Integer posicionCinco;
    private Integer posicionSeis;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date fechaSorteo;

    public Sorteo(SorteoDTO sorteoDTO) {
        this.id = sorteoDTO.getId();
        this.posicionUno = sorteoDTO.getPosicionUno();
        this.posicionDos = sorteoDTO.getPosicionDos();
        this.posicionTres = sorteoDTO.getPosicionTres();
        this.posicionCuatro = sorteoDTO.getPosicionCuatro();
        this.posicionCinco = sorteoDTO.getPosicionCinco();
        this.posicionSeis = sorteoDTO.getPosicionSeis();
        this.fechaSorteo = sorteoDTO.getFechaSorteo();
    }
}
