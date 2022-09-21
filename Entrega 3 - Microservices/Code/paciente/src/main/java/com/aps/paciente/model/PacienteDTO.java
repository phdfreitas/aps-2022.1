package com.aps.paciente.model;

import lombok.Value;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Value
public class PacienteDTO {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private String email;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Paciente toEntity() throws ParseException {
        return Paciente.builder()
                .nome(nome)
                .cpf(cpf)
                .dataNascimento(sdf.parse(dataNascimento))
                .telefone(telefone)
                .email(email)
                .build();
    }

}
