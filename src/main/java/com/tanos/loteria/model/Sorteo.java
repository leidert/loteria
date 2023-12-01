package com.tanos.loteria.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tanos.loteria.DTO.SorteoDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date fechaSorteo;

    public Sorteo(SorteoDTO sorteoDTO) {
        this.id = sorteoDTO.getId();
        this.posicionUno = sorteoDTO.getA();
        this.posicionDos = sorteoDTO.getB();
        this.posicionTres = sorteoDTO.getC();
        this.posicionCuatro = sorteoDTO.getD();
        this.posicionCinco = sorteoDTO.getE();
        this.posicionSeis = sorteoDTO.getF();
        this.fechaSorteo = sorteoDTO.getFECHA();
    }
}
