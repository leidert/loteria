package com.tanos.loteria.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tanos.loteria.model.Sorteo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class SorteoDTO {
    private String id;
    private Integer A;
    private Integer B;
    private Integer C;
    private Integer D;
    private Integer E;
    private Integer F;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date FECHA;

    public SorteoDTO(Sorteo sorteo) {
        this.id = sorteo.getId();
        this.A = sorteo.getPosicionUno();
        this.B = sorteo.getPosicionDos();
        this.C = sorteo.getPosicionTres();
        this.D = sorteo.getPosicionCuatro();
        this.E = sorteo.getPosicionCinco();
        this.F = sorteo.getPosicionSeis();
        this.FECHA = sorteo.getFechaSorteo();
    }
}
