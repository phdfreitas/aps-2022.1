package com.aps.paciente.model;

import lombok.Value;

@Value
public class PacienteDTO {

    private String nome;
    private String cpf;
    private String telefone;

    public Paciente toEntity(){
        return Paciente.builder().nome(nome).cpf(cpf).telefone(telefone).build();
    }

}
