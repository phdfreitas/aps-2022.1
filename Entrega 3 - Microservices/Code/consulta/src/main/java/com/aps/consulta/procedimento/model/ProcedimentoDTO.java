package com.aps.consulta.procedimento.model;

import lombok.Value;

@Value
public class ProcedimentoDTO {

    private String nome;
    private Double valor;

    public Procedimento toEntity(){
        return Procedimento.builder().nome(nome).valor(valor).build();
    }

}
