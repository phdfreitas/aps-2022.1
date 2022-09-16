package com.aps.consulta.consulta.model;

import com.aps.consulta.procedimento.model.Procedimento;
import lombok.Value;

@Value
public class ConsultaDTO {

    private String nome;
    private Procedimento procedimento;
    private Long paciente;

    public Consulta toEntity(){
        return Consulta.builder().nome(nome).procedimento(procedimento.getNome()).paciente(paciente).build();
    }

}
